package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songhaoming
 */
@RestController
@RequestMapping("/pro")
public class DemoController {

    @GetMapping("/test1")
    public String test1() {
        return "this is test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "this is test2";
    }

    @GetMapping("/test3")
    public String test3() {
        return "this is test3";
    }
}

