package com.board.portfolio.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @GetMapping("/logout")
    String logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        this.logoutHandler.logout(request, response, authentication);
        return "redirect:/login";
    }
}
