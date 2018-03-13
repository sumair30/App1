package git_hub_sumair_app1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to Sumair's App1. This is a sample project done on Spring-Boot!";
    }

}
