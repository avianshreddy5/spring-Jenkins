package spring_Jenkins.com;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("application started");
	}

	public static void main(String[] args) {
		logger.info("application started");

		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
