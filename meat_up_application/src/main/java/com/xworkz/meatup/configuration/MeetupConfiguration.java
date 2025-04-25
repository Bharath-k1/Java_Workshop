package com.xworkz.meatup.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz")
public class MeetupConfiguration implements WebMvcConfigurer {
    public MeetupConfiguration(){
        System.out.println("MeetupConfiguration created");
    }
}
