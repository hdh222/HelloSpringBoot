package com.example.hellospringboot.controller;

import com.example.hellospringboot.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("board")
    public ModelAndView board(ModelAndView mView){

        mView.addObject("boardList", boardService.list());
        mView.setViewName("board/list");

        return mView;
    }
}
