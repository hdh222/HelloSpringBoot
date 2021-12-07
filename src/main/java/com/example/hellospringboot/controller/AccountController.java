package com.example.hellospringboot.controller;

import com.example.hellospringboot.service.AccountService;
import com.example.hellospringboot.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("account/loginform")
    public String loginform(){

        return "account/loginform";
    }
    @PostMapping("account/login")
    public ModelAndView login(ModelAndView mView, HttpSession session, UsersVO usersVO){

        System.out.println("ss :" + usersVO);
        accountService.login(mView, session, usersVO);

        mView.setViewName("Account/login");
        return mView;
    }

    @RequestMapping("account/logout")
    public String logout(HttpSession session){
        session.invalidate();

        return "account/logout";
    }


}
