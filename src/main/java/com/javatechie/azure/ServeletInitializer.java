package com.javatechie.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication 
public class ServeletInitializer extends SpringBootServletInitializer {  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(SpringbootAzuresqlApplication.class);  
    }  
  
    public static void main(String[] args) {  
        SpringApplication.run(SpringbootAzuresqlApplication.class, args);  
    }  
}
