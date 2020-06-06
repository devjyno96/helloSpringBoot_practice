package kr.ac.hansung.cse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*To run Spring Boot application in Eclipse

Steps: 1. go to Run->Run configuration -> Maven Build -> New configuration
2. set base directory of you project ie. ${project_loc:helloSpringBoot}
3. set goal spring-boot:run
4. Run project from Run->New_Configuration*/

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

}
