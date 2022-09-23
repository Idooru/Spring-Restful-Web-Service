package com.example.myrestfulservice.helloworld.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Integer id;

    @Size(min = 2, max = 10, message = "Name은 2글자 이상 10글자 이하로 입력해 주세요.")
    @NotNull
    private String name;

    @Past
    @NotNull
    private Date joinDate;
}
