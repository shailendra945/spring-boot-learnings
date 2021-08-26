package com.infoiv.custom.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomPropertiesUsages implements CommandLineRunner {


    private final ConfigProperties props;

    CustomPropertiesUsages(ConfigProperties props){
        this.props=props;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(" host : "+ props.getHostName());
        System.out.println(" port : "+ props.getPort());
        System.out.println(" from : "+ props.getFrom());
    }
}
