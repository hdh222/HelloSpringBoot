package com.example.hellospringboot.controller;

import com.example.hellospringboot.service.BoardService;
import com.example.hellospringboot.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("board")
    public ModelAndView board(ModelAndView mView, HttpSession session){

        String id = (String)session.getAttribute("id");

        mView.addObject("id",id);
        mView.addObject("boardList", boardService.list());
        mView.setViewName("board/list");

        return mView;
    }

    @RequestMapping("board/insertform")
    public ModelAndView insertform(ModelAndView mView, HttpSession session){

        String id = (String)session.getAttribute("id");
        mView.addObject("id",id);
        mView.setViewName("board/insertform");
        return mView;
    }

    @PostMapping("board/insert")
    public String insert(BoardVO boardVO){
        System.out.println("board : " + boardVO);
        boardService.insert(boardVO);

        return "board/insert";
    }

    @GetMapping("board/delete")
    public ModelAndView delete(@RequestParam("seq") String seq, ModelAndView mView){

        boardService.delete(seq);

        mView.setViewName("redirect:/board");
        return mView;
    }
}
