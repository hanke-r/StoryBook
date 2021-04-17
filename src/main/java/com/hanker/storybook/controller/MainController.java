package com.hanker.storybook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value="/home")
    public String main() throws Exception{
        return "main";
    }
}