package arif.rizal;
import java.util.stream.IntStream;

public class PrimitiveStreamTest {
    public static void main(String[] args) {
        testCreatePrimitiveStream();
    }

    static void testCreatePrimitiveStream() {
        // Membuat IntStream dari daftar nilai
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);
        System.out.println("IntStream dari of():");
        intStream.forEach(System.out::println);

        // Membuat IntStream dari rentang nilai
        IntStream intStream1 = IntStream.range(1, 10);
        System.out.println("IntStream dari range(1, 10):");
        intStream1.forEach(System.out::println);

        // Membuat IntStream menggunakan Builder
        IntStream.Builder builder = IntStream.builder();
        builder.add(1).add(2).add(3).add(4).add(5).add(6);
        IntStream intStream2 = builder.build();
        System.out.println("IntStream dari builder:");
        intStream2.forEach(System.out::println);
    }
}
