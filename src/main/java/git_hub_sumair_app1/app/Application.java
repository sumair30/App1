package git_hub_sumair_app1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication 
@ComponentScan("git_hub_sumair_app1")
@EntityScan("git_hub_sumair_app1")
@EnableJpaRepositories("git_hub_sumair_app1")
public class Application {

	public static void main(String[] args) {
		//This triggers the start of the spring boot application
		SpringApplication.run(Application.class, args);
	}
	
}
