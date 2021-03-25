package com.sparta.makeboard.model;


import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class Board {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @NotNull
    @Size(min=2, max=20, message = "2자 이상 20자 이하로 입력해주세요.")
    private String title;

    @NotNull
    @Size(min=2, max=140, message = "2자 이상 140자 이하로 입력해주세요.")
    private String content;
}
