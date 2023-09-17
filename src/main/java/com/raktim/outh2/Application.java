package com.raktim.outh2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController

public class Application {

    @GetMapping("/")
    public String user(@AuthenticationPrincipal OAuth2User principal){
        return principal.getAttribute("name");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
