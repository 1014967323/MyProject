package com.how2java.springboot.web;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@Controller
public class HelloController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/nowDate")
    public String hello(Model m) {

        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }

}