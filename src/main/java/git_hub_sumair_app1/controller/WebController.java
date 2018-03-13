package git_hub_sumair_app1.controller;

import org.springframework.web.bind.annotation.RestController;

import git_hub_sumair_app1.beans.WelcomeBean;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WebController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/welcome")
    public WelcomeBean greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new WelcomeBean("1",
                            String.format(template, name));
    }
}
