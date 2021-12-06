package com.example.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home(ModelAndView mView, HttpSession session){

        String id = (String)session.getAttribute("id");

        if(id != null){
            mView.addObject("id", id);
        }

        mView.setViewName("home");

        return mView;
    }
}
