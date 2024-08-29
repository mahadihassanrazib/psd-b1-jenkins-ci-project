package psd_b1_ci.jenkin_ci_pipeline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class JenkinCiPipelineApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(JenkinCiPipelineApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("This is a test class v2");
        assertEquals(true, true);
    }

}