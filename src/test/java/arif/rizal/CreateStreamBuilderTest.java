package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;


public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder(){
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("arif");
        builder.add("rizal").add("aza");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify(){
        Stream<Object> stream =  Stream.builder().add("adel").add("adil").add("adul").build();
        stream.forEach(System.out::println);
    }

}
