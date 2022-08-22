package com.github_test.githubRepositoryforTest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("testr/get")
    public String testhello(){
        return "hello";
    }



}
