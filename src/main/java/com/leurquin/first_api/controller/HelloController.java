package com.leurquin.first_api.controller;

import ch.qos.logback.core.util.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

//import java.text.SimpleDateFormat;
//import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false) String name,@RequestParam(required = false, defaultValue = "false")boolean getTime) {
        String message=StringUtil.isNullOrEmpty(name)?"Hello World":"Hello " + name;

        /*if (StringUtil.isNullOrEmpty(name)) {
            message= "Hello World";
        } else {
            message="Hello " + name;
        }*/

        if(getTime)
            message+=", Current time: " + getCurrentTime();

        return message;
    }

    private String getCurrentTime() {
        return LocalDateTime.now().toString();

        //SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        //return sdf.format(new Date());
    }
}
