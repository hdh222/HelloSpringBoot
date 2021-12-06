package com.example.hellospringboot.repository;

import com.example.hellospringboot.vo.UsersVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@Mapper
public interface AccountRepository {
    UsersVO isExistID(UsersVO usersVO);
}
