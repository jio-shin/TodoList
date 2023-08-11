package com.multicampus.springex.dto;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data       //@Data 이용하면 setter,getter안만들어도 됨
@Builder
@AllArgsConstructor     // 모든 속성에 대한 아규먼트 처리함. TodoDTO(int tno, String name){}
@NoArgsConstructor      //defualt생성자
public class TodoDTO {
    private Long tno;
    @NotEmpty   //Null, 빈문자열 불가능
    private String title;

    @Future     //현재보다 미래인가?
    private LocalDate dueDate;
    private boolean finished;

    @NotEmpty
    private String writer;
}


