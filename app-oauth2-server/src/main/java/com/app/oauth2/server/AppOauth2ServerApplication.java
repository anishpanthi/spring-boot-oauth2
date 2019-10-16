package com.app.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class AppOauth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppOauth2ServerApplication.class, args);
    }

}
