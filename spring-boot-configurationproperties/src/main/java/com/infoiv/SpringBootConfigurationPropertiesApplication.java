package com.infoiv;

  import com.infoiv.custom.properties.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
  import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//not require after spring boot 2.2
//@EnableConfigurationProperties(ConfigProperties.class)
//to scan configuration properties if not scannable in regular search
@ConfigurationPropertiesScan(basePackages ="com.diffpack" )
@ComponentScan(basePackages = {"com.diffpack","com.infoiv"})
public class SpringBootConfigurationPropertiesApplication {



    public static void main(String [] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootConfigurationPropertiesApplication.class, args);
    }

}
