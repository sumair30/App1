package git_hub_sumair_app1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import git_hub_sumair_app1.dependencyImpl.AppDependencyImpl;

@SpringBootApplication 
@ComponentScan(basePackages="git_hub_sumair_app1")
public class Application {

	public static void main(String[] args) {
		//This triggers the start of the spring boot applicaiton
		SpringApplication.run(Application.class, args);
	}
	
}
