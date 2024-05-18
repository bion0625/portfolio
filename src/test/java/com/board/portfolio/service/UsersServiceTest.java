package com.board.portfolio.service;

import com.board.portfolio.model.entity.Users;
import com.board.portfolio.repository.UsersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@SpringBootTest
@Transactional
class UsersServiceTest {
    @Autowired
    UsersService usersService;

    @Autowired
    UsersRepository usersRepository;

    @Test
    void joinDuplication() {
        // given
        Users users = getTempUser();
        usersRepository.save(users);

        // when
        String joinFlag = usersService.join(users.toDto());

        // then
        assert Objects.equals(joinFlag, "Duplication For Username");
    }

    @Test
    void joinSuccess() {
        // given
        Users users = getTempUser();

        // when
        String joinFlag = usersService.join(users.toDto());

        // then
        assert Objects.equals(joinFlag, "SUCCESS");
    }

    private Users getTempUser () {
        return new Users("testUsername", "testPassword", true);
    }
}