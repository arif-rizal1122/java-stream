package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectOperationTest {

    @Test
    void testCollectorsCollect() {
        List<String> names = List.of("Arif", "Roiz", "Adel", "ade");

        Set<String> set = names.stream().collect(Collectors.toSet());
        Set<String> immutableSet = names.stream().collect(Collectors.toUnmodifiableSet());

        List<String> list = names.stream().collect(Collectors.toList());
        List<String> immutableList = names.stream().collect(Collectors.toUnmodifiableList());

        // Output untuk pengecekan
        System.out.println("Set: " + set);
        System.out.println("Immutable Set: " + immutableSet);
        System.out.println("List: " + list);
        System.out.println("Immutable List: " + immutableList);
    }

    @Test
    void testCollectorsMap(){
        System.out.println("=========================================================== ");
        List<String> names = List.of("Asep", "Budi", "Clay", "Dewi");
        Map<String, Integer> map = names.stream().collect(Collectors.toMap(name -> name, name -> name.length())); // key nya adalah name nya sedangkan value adalah panjang lenght
        System.out.println(map); // {Clay=4, Asep=4, Dewi=4, Budi=4}

    }

}
