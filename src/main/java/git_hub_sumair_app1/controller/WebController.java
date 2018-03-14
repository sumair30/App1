package git_hub_sumair_app1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import git_hub_sumair_app1.beans.UserInputBean;
import git_hub_sumair_app1.beans.WelcomeBean;
import git_hub_sumair_app1.dependency.AppDependency;

import java.awt.print.Printable;
import java.io.IOException;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WebController {

    private static final String template = "Hello, %s!";
    private static final String postTemplate = "Hello, %s!";

    /*
     * Demonstration of Dependency Injections
     * */
    @Autowired
	@Qualifier("AppDependencyImpl")
	private AppDependency appDependency;
    
    /*
     * Method will print when we hit the server eg. localhost:8080
     * Default to Get
     * */
    	@RequestMapping("/")
        public String index() {
            return "Welcome to Sumair's App1. This is a sample project done on Spring-Boot!";
        }
    
    /*
     * Method will print when we hit the server eg. localhost:8080/welcome
     * Also this method will take in the name paramter eg. localhost:8080/welcome?name=abc
     * Default to Get
     * */
    @RequestMapping("/welcome")
    public WelcomeBean greeting(@RequestParam(value="name", defaultValue="there") String name) {
        return new WelcomeBean("1",
                            String.format(template, name));
    }
    
    /*
     * Method will print when we hit the server eg. localhost:8080/postWelcome
     * method type is POST
     * Also this method will take request body json in map here the payload should have 
     * a map with key name and value in it
     * */
    @RequestMapping(method = RequestMethod.POST, name="/postWelcome")
    public WelcomeBean postGreetings(@RequestBody Map<String, Object> payload) {
        if(payload.containsKey("name"))
    	return new WelcomeBean("1",
                            String.format(postTemplate, payload.get("name").toString()+": The time is : " + appDependency.getLocalTime()));//implementing DI here no need to create object to call local time)
        else
        	return new WelcomeBean("1",
                    String.format(postTemplate, "there post method"));
    }
    
   /* @RequestMapping(method = RequestMethod.POST, name="/postUserDetails")
    public WelcomeBean postUserDetails(@RequestParam(value="userDetails",required=true) String inputJson) {
        if(inputJson.isEmpty())
    	return new WelcomeBean("404","The Input Json is empty");
        else{
        	UserInputBean input = this.convertStringJsonToObject(inputJson);
        	return new WelcomeBean("1",
        			input.getName());
        }
    }*/
    
    private UserInputBean convertStringJsonToObject(String inputJson){
		ObjectMapper mapper = new ObjectMapper();
		try {
			return (UserInputBean) mapper.readValue(inputJson, UserInputBean.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
    
}
