package com.board.portfolio.repository;

import com.board.portfolio.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, String> {

    Optional<Users> findByUsername(String username);
}
