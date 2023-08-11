package com.multicampus.springex.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TodoVO {//데이터베이스와 동일함.
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private String writer;
    private boolean finished;


}
