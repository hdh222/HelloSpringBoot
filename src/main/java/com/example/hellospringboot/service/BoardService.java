package com.example.hellospringboot.service;

import com.example.hellospringboot.vo.BoardVO;

import java.util.List;

public interface BoardService {
    public List<BoardVO> list();
    public void insert(BoardVO boardVO);
    public void delete(String seq);
}
