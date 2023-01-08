package com.acc.springjenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/data")
    public String getData(){
        return "Hello World...!";
    }

    @GetMapping("/test")
    public String testData(){
        return "Test Branch...!";
    }

    @GetMapping("/invoke")
    public String invokeData(){
        return "invoke method from DataController...!";
    }

    @GetMapping("/naga")
    public String nagaData(){
        return "invoke method from DataController...!";
    }




}
