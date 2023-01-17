package com.in28minutes.springboot.mywebapp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("in28minutes");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidUsername && isValidPassword;
    }
}
