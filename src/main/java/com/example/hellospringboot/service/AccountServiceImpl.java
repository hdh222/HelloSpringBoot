package com.example.hellospringboot.service;

import com.example.hellospringboot.repository.AccountRepository;
import com.example.hellospringboot.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void login(ModelAndView mView, HttpSession session, UsersVO usersVO) {

        UsersVO usersInfo = accountRepository.isExistID(usersVO);

        if(usersInfo.getUser_id() != null){
            session.setAttribute("id", usersInfo.getUser_id());
            mView.addObject("id", usersInfo.getUser_id());
        }
    }
}
