package com.sjsu.backbenchers.vBless;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class App extends SpringBootServletInitializer 
{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
