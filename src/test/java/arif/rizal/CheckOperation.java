package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperation {
    @Test
    void testCheckOperation(){
        List<String> names = List.of("Arif", "Rizal", "Aza");

        boolean anyMatch = names.stream().anyMatch(name -> name.length() > 10);
        boolean allMatch = names.stream().allMatch(name -> !name.isBlank());
        boolean noneMatch = names.stream().noneMatch(name -> name.equals(name.toUpperCase()));

        System.out.println("any match \t " + anyMatch + " all Match  \t " + allMatch + " none match \t " + noneMatch);


    }
}
