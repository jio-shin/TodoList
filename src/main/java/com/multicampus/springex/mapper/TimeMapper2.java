package com.multicampus.springex.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper2 {   //데이터베이스의 현재 시각을 문자열로 받아와서 처리,구성하겠다
    String getNow();
}
