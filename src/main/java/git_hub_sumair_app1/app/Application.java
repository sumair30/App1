package git_hub_sumair_app1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan(basePackages="git_hub_sumair_app1.controller")
public class Application {

	public static void main(String[] args) {
		//This triggers the start of the spring boot applicaiton
		SpringApplication.run(Application.class, args);
	}
}
