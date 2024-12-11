package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {
    @Test
    void testFilteringOperation(){
        List<String> names = List.of("Arif", "Rizal", "Aza");
        names.stream().filter(name -> name.length() < 4).forEach(System.out::println);
        System.out.println("====================================");
        names.stream().distinct().forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

    }

    @Test
void testDistinct(){
        List<String> names = List.of("Arif", "Rizal", "Aza", "Aza");
        names.stream().distinct().forEach(System.out::println);

    }
}
