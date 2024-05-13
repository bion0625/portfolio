package com.board.portfolio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity // 스프링 시큐리티 6 버전으로 구현
public class SecurityConfig {
    @Bean
    SecurityFilterChain web(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests((authorize) -> authorize
                        // "/index", "/" 두 url 빼고는 로그인 필요
                        .requestMatchers("/index", "/").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(withDefaults());
        // ...

        return http.build();
    }
}
