package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvalutionTest {

    @Test
    void testIntermediateOperationTest(){ // map adalah intermediate operation / lazy laoding
        Stream<String> names = List.of("AS","BAS","CAS").stream();
        Stream<String> upperNames = names.map(name -> {
            System.out.println("Change " + name + " to UPPERCASE");
            return name.toUpperCase();
        }).map(up -> {
            System.out.println("Change Mr " + up + " to Mr");
            return "Mr. " + up;
        });
        System.out.println("\n =================================================================");
        upperNames.forEach(upperName -> { // terminal operation dia mentrigger Stream  nya agar bisa mengalir
            System.out.println("Print Name : " + upperName);
        });



    }

}
