package com.infoiv.custom.properties;

import com.diffpack.ApplicationSpecificProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomPropertiesUsages implements CommandLineRunner {


    private final ConfigProperties props;
    private final ApplicationSpecificProps appProp;

    CustomPropertiesUsages(ConfigProperties props,ApplicationSpecificProps appProp)
    {
        this.props=props;
        this.appProp=appProp;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(" host : "+ props.getHostName());
        System.out.println(" port : "+ props.getPort());
        System.out.println(" from : "+ props.getFrom());

        System.out.println(" prefix : "+ appProp.getPrefix());
        System.out.println(" suffix : "+ appProp.getSuffix());
    }
}
