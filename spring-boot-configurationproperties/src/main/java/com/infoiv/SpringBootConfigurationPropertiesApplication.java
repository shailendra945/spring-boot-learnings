package com.infoiv;

import com.infoiv.custom.properties.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@EnableConfigurationProperties(ConfigProperties.class)
public class SpringBootConfigurationPropertiesApplication {



    public static void main(String [] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootConfigurationPropertiesApplication.class, args);
    }

}
