package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AggregateOperationsTest {

    @Test
    void testAggregateOperation(){
        List<String> names = List.of("Arif", "Rizal", "Aza");
        Optional<String> max = names.stream().max(Comparator.naturalOrder());
        Optional<String> min = names.stream().min(Comparator.naturalOrder());
        long count = names.stream().count();
        System.out.println(count);
    }

    @Test
    void testReduceOperator()
    {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Integer sum = numbers.stream().reduce(0,(result, item) -> result +item);
        Integer factorial = numbers.stream().reduce(1, (result, item) -> result * item);
        System.out.println("SUM " + sum);
        System.out.println("FACTORIAL " + factorial);
    }
}
