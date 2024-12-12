package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTest {
    @Test
    void testCollectorsGroupBy(){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<String, List<Integer>> map = numbers.stream()
                .collect(Collectors.groupingBy(integer -> integer > 5 ? "besar" : "kecil"));
        System.out.println(map);
        System.out.println("====================================================================");
        List<String> names = List.of("aimer", "chia fujikawa", "harutya san", "ai higuchi", "yoasobi", "ado");
        Map<String, List<String>> map1 = names.stream()
                .collect(Collectors.groupingBy(name -> name.length() > 4 ? "besar" : "kecil"));
        System.out.println(map1);
    }

    @Test
    void testCollectorsPartioning(){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(integer -> integer > 5));
        System.out.println(map);

        List<String> names = List.of("Arif", "Badel", "Cuin", "DESK");
        Map<Boolean, List<String>> map1 = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println(map1);

    }

}
