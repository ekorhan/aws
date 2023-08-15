package com.demo.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class AwsApplication {

    public static void main(String[] args) {
        Logger.getGlobal().warning("AwsApplication will be start");
        SpringApplication.run(AwsApplication.class, args);
        Logger.getGlobal().warning("AwsApplication has been started");
    }

}
