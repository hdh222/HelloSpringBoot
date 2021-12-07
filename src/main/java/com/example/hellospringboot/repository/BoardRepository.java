package com.example.hellospringboot.repository;

import com.example.hellospringboot.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Mapper
public interface BoardRepository {
    List<BoardVO> list();
}
