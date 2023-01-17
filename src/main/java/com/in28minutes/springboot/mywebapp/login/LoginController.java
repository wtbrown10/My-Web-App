package com.in28minutes.springboot.mywebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    //a more professional way to log info vs system.out.println
    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.info("Request param is {}", name); // can either put info level, debug, warn, error etc...
        //System.out.println("Request param is " + name);
        return "login";
    }
}
