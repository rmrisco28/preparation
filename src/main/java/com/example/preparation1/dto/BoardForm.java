package com.example.preparation1.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardForm {
    private String title;
    private String content;
    private String author;
}
