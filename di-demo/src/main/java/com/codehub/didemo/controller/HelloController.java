package com.codehub.didemo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("sampleController")
public class HelloController {

    public String helloCodeHub() {
        System.out.println("Hello Code Hub Spring Course");
        return "foo";
    }
}
