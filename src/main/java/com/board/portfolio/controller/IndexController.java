package com.board.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index() {
        System.out.println("test");
        return "index";
    }

    @GetMapping("index")
    public String reIndex() {
        System.out.println("test2");
        return "index";
    }
}
