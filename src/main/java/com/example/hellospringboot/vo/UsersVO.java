package com.example.hellospringboot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsersVO {
    private String user_id;
    private String user_pw;
}
