package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class CreateOrderingOperationTest {

    @Test
    void testOrderingOperation(){
        List<String> names = List.of("Arif", "Rizal", "Aza");
        names.stream().sorted().forEach(System.out::println);
        System.out.println("============================== ");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}
