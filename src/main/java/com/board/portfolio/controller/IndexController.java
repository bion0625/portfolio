package com.board.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    /*
     * 로그인 안 해도 접근 가능
     */
    @GetMapping
    String root() {
        return "index";
    }

    /*
    * 로그인 안 하면 접근 불가
    */
    @GetMapping("/index")
    String index() {
        return "index";
    }
}
