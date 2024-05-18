package com.board.portfolio.model.entity;

import com.board.portfolio.model.dto.UsersDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @Column(name = "USERNAME", nullable = false, length = 50)
    String username;

    @Column(name = "PASSWORD", nullable = false, length = 500)
    String password;

    @Column(name = "ENABLED", nullable = false)
    Boolean enabled;

    public UsersDto toDto () {
        return new UsersDto(this.username, this.password);
    }
}
