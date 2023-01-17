package com.in28minutes.springboot.mywebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    @Autowired
    private AuthenticationService authenticationService;
    //a more professional way to log info vs system.out.println
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        //logger.info("Request param is {}", name); // can either put info level, debug, warn, error etc...
        //System.out.println("Request param is " + name);
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials! Please try again.");
        return "login";
    }
}