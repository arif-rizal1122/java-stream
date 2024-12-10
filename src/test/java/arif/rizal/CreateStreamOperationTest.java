package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreamOperationTest {

    @Test
    void testMapStream(){
        List<String> names = List.of("arif", "rizal", "aza");
        Stream<String> streamName = names.stream();
        Stream<String> streamUpper = streamName.map(name -> name.toUpperCase());
        streamUpper.forEach(System.out::println);
        System.out.println("=== data baru nya ===");
        names.forEach(System.out::println);

    }

}
