package com.board.portfolio.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class IndexControllerTest {

    @Autowired
    private MockMvc mvc;

    /*
     * 로그인 하지 않아도 / 에 접근 가능
     * */
    @Test
    void rootIsOk() throws Exception {
        mvc.perform(get("/"))
                .andExpect(status().isOk());
    }

    /*
    * 로그인 하지 않으면 /index 에 접근 불가
    * */
    @Test
    void indexIsFount() throws Exception {
        mvc.perform(get("/index"))
                .andExpect(status().isFound());
    }

    /*
     * 로그인 하면 /index 에 접근 가능
     * */
    @WithMockUser
    @Test
    void indexIsOkWithUser() throws Exception {
        mvc.perform(get("/index"))
                .andExpect(status().isOk());
    }

}