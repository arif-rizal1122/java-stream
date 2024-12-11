package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testRetrieveOperationTest(){
        List<String> names = List.of("Farhan", "Sahrul", "Hairul", "Nissa", "Lissa", "Naya", "aza");

        System.out.println("=============== ambil 2 data pertama ===========");
        names.stream().limit(2).forEach(System.out::println);
        System.out.println("================ skip 3 data pertama =============");
        names.stream().skip(3).forEach(System.out::println);
        System.out.println("============ filter lenght ===========");
        names.stream().takeWhile(name -> name.length() != 4).forEach(System.out::println);
        System.out.println("===========  ===========");
        names.stream().dropWhile(name -> name.length() <= 4).forEach(System.out::println);

    }

    @Test
    void testRetrivingSingleElement(){
        List<String> names = List.of("amer", "harutya", "chia", "yoasobi");

        Optional<String> anyName = names.stream().findAny();
        Optional<String> firstName = names.stream().findFirst();

       anyName.ifPresent(name -> {
           System.out.println(name);
       });
       firstName.ifPresent(name -> {
           System.out.println(name);
       });
    }

}
