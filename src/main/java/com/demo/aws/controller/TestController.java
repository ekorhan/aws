package com.demo.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    @GetMapping()
    public String index() {
        return "INDEX: HELLO";
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello World :)";
    }
}
