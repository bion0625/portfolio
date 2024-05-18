package com.board.portfolio.repository;

import com.board.portfolio.model.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@SpringBootTest
@Transactional
class UsersRepositoryTest {
    @Autowired
    UsersRepository usersRepository;

    @Test
    void saveAndFindByUsername() {
        // given
        String expectedUsername = "testUsername";
        Users users = new Users(expectedUsername, "testPassword", true);

        // when
        usersRepository.save(users);
        Users findUsers = usersRepository.findByUsername(expectedUsername).orElse(null);

        // then
        assert findUsers != null;
        assert Objects.equals(users.getUsername(), findUsers.getUsername());
    }
}