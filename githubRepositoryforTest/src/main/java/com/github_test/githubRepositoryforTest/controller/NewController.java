package com.github_test.githubRepositoryforTest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("test/get")
    public String testhello1(){
        return "hello!!!!!";
    }
    @PostMapping("test/post")
    public String testhello2(){
        return "hello!!!!!";
    }



}
