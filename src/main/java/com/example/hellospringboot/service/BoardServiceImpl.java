package com.example.hellospringboot.service;

import com.example.hellospringboot.repository.BoardRepository;
import com.example.hellospringboot.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<BoardVO> list() {

        List<BoardVO> list = boardRepository.list();

        return list;
    }

    @Override
    public void insert(BoardVO boardVO) {
        boardRepository.insert(boardVO);
    }

    @Override
    public void delete(String seq) {
        boardRepository.delete(seq);
    }
}
