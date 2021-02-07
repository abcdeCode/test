package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
        int count = 0;
        Random random=new Random();
        int num = random.nextInt();
        for (int i = 0; i < 10; i++) {
            count += num;
        }
        return "this is test3 " + count;
    }

    //http://localhost:8081/pro/test4?page=1&size=6
    @GetMapping("/test4")
    public Object test4(String page, String size) {
        Map<String, String> map = new HashMap<>(16);
        if ("".equals(page) || "".equals(size)) {
            return "参数不能为空";
        } else {
            map.put("page", page);
            map.put("size", size);
            return map;
        }
    }
}

