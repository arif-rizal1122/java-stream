package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateSingleStream(){
        Stream<String> emptyStream = Stream.empty();
        Stream<String> oneStream = Stream.of("arif");
        Stream<String> emptyOrNotStream = Stream.ofNullable(null);

        Stream<String> stringStream = Stream.of("a", "b", "c");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        Stream<String> arrayStream = Arrays.stream(new String[]{"d","e","f"});
//        emptyStream.forEach(value -> {
//            System.out.print("\n " + value);
//        });
//        oneStream.forEach(value -> {
//            System.out.print("\n " + value);
//        });
//        emptyOrNotStream.forEach(value -> {
//            System.out.print("\n " + value);
//        });
//        stringStream.forEach(value-> {
//            System.out.print("\n " + value);
//        });
//        integerStream.forEach(value -> {
//            System.out.print("\n " + value);
//        });
        arrayStream.forEach(value -> {
            System.out.print("\n " + value);
        });

        System.out.println("\n === Membuat Stream dari Collection ===");

        Collection<String> stringCollection = List.of("ARIF","RIZAL","AZA");
        Stream<String> stringStreamx = stringCollection.stream();
        //stringStreamx.forEach(val -> {System.out.println(val); });
        stringStreamx.forEach(System.out::println);

        System.out.println("\n === Membuat Infinite String ===");
        // Stream<String> stream1 = Stream.generate(() -> "arif");  // overloop
        // Stream<Integer> stream2 = Stream.iterate("arif", value -> value.toUpperCase()); // overloop



    }

}
