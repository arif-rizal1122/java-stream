package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class PararrelStreamTest {
    @Test
    void testSequential(){
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });
//        main : 1
//        main : 2
//        main : 3
//        main : 4
//        main : 5
//        main : 6
//        main : 7
//        main : 8
//        main : 9
//        main : 10
    }

    @Test
    void testPararrelStream(){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> parallelStream = numbers.stream().parallel();
        parallelStream.forEach(number -> {
            System.out.println("THREAD " + Thread.currentThread() + " : " + number);
        });
    }
//    THREAD Thread[#21,ForkJoinPool.commonPool-worker-1,5,main] : 3
//    THREAD Thread[#23,ForkJoinPool.commonPool-worker-3,5,main] : 5
//    THREAD Thread[#21,ForkJoinPool.commonPool-worker-1,5,main] : 9
//    THREAD Thread[#23,ForkJoinPool.commonPool-worker-3,5,main] : 4
//    THREAD Thread[#23,ForkJoinPool.commonPool-worker-3,5,main] : 8
//    THREAD Thread[#23,ForkJoinPool.commonPool-worker-3,5,main] : 1
//    THREAD Thread[#23,ForkJoinPool.commonPool-worker-3,5,main] : 6
//    THREAD Thread[#1,main,5,main] : 7
//    THREAD Thread[#21,ForkJoinPool.commonPool-worker-1,5,main] : 10
//    THREAD Thread[#22,ForkJoinPool.commonPool-worker-2,5,main] : 2

}
