package com.SpringSecurity.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebSecurity
public class SpringConfig implements WebMvcConfigurer{

	
   
    protected void configure(HttpSecurity http) throws Exception {  
        
        http  
        .antMatcher("/")                                 
        .authorizeRequests()  
            .anyRequest().hasRole("ADMIN")  
            .and()  
        .httpBasic();  
    } 
}
