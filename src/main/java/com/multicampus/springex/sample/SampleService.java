package com.multicampus.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //서비스 계층의 객체를 위한 객체 표시
@ToString
@RequiredArgsConstructor
public class SampleService {
    @Qualifier("normal")
    //primary 쓰려면 Qualifier 쓰면 안됨
    private final SampleDAO sampleDAO; //객체와 객체의 의존관계의 실제 객체를 몰라도 주입이 가능하게 하는 방식 =느슨한 결합

 /*   @Autowired
    private SampleDAO sampleDAO; */  //field injection
}
