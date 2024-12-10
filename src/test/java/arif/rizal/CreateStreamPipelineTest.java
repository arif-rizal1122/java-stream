package arif.rizal;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CreateStreamPipelineTest {
    @Test
    void testStreamPipeline(){
        List.of("Arif", "Budi", "Cemen").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "MR. " + upper)
                .forEach(mr -> System.out.println(mr));
    }

}
