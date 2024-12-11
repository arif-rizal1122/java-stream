package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void testForEachOperation(){
        List<String> names = List.of("Arif", "Rizal", "Aza");

        names.stream()
                .map(val -> {
                    System.out.println("normal name " + val);
                    return val;
                })
                .map(String::toUpperCase)
                .peek(upper -> System.out.println("Upper Name : " + upper))
                .forEach(System.out::println);

    }
}
