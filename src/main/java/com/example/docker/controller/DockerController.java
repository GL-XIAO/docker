package com.example.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @RequestMapping("/hello")
    public String add(){
        return "今天上课收获很多，占用的大家时间也很不好意思";
        }
}
