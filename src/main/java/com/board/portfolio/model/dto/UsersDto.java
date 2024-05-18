package com.board.portfolio.model.dto;

import com.board.portfolio.model.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    String username;
    String password;

    public Users toEntity() {
        return new Users(this.username, this.password, true);
    }
}
