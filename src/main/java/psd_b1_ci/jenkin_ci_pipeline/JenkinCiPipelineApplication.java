package psd_b1_ci.jenkin_ci_pipeline;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinCiPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinCiPipelineApplication.class, args);
		System.out.println("start");
	}

}
