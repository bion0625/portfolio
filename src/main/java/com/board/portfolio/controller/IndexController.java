package com.board.portfolio.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {

    /*
     * 로그인 안 해도 접근 가능
     */
    @GetMapping
    String root(Authentication authentication) {
        if (authentication != null) {
            UserDetails details = (UserDetails) authentication.getPrincipal();
            log.info("user: {}", details);
        } else log.info("no user");
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
