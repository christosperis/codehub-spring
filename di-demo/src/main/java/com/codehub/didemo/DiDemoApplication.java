package com.codehub.didemo;

import com.codehub.didemo.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        HelloController helloController = (HelloController) ctx.getBean("sampleController");

        helloController.helloCodeHub();

    }
}
