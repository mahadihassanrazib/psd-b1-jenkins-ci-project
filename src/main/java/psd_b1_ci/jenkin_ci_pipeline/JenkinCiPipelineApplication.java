package psd_b1_ci.jenkin_ci_pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinCiPipelineApplication {

	static Logger logger = new LoggerFactory.getLogger(JenkinCiPipelineApplication.class)

	public static void main(String[] args) {

		logger.info("This is a test running job v1.")

		SpringApplication.run(JenkinCiPipelineApplication.class, args);
	}

}
