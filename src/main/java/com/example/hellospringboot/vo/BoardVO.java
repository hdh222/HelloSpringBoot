package com.example.hellospringboot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardVO {
    private int seq;
    private String title;
    private String content;
    private String writer;
    private String board_date;
}
