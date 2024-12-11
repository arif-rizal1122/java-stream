package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

//    @Test
//    void testMapOperation(){
//        List.of("Arif", "Rizal", "Aza").stream()
//                .map(name -> name.toUpperCase())
//                .map(upperName -> upperName.length())
//                .forEach(length -> System.out.println(length));
//    }

    @Test
    void testFlatMap(){
        List.of("Adel", "Adil", "Adul").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper, upper)) //
                .forEach(lenght -> System.out.println(lenght));
    }

}
