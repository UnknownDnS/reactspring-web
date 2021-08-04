package hello.hellospring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloSpringApplication {

	public static void main(String[] args) {
		log.debug("adsfasdfasdf");
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}