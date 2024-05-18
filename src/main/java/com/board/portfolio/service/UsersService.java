package com.board.portfolio.service;

import com.board.portfolio.model.dto.UsersDto;
import com.board.portfolio.model.entity.Users;
import com.board.portfolio.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    String join (UsersDto dto) {
        Users users = usersRepository.findByUsername(dto.getUsername()).orElse(null);
        if (users != null) {
            // TODO 추후 Exception 포맷 만들어서 대체
            return "Duplication For Username";
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        dto.setPassword(encoder.encode(dto.getPassword()));
        Users save = usersRepository.save(dto.toEntity());
        if (dto.getUsername().equals(save.getUsername())) {
            return "SUCCESS";
        } else return "FAIL";
    }
}
