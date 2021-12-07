package com.example.hellospringboot.service;

import com.example.hellospringboot.vo.BoardVO;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface BoardService {
    public List<BoardVO> list();
}
