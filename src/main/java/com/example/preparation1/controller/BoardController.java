package com.example.preparation1.controller;

import com.example.preparation1.dto.BoardForm;
import com.example.preparation1.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("pre")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("write")
    public String write() {
        return "pre/write";
    }

    
    @PostMapping("write")
    public String writePost(BoardForm data) {
        boardService.add(data);

        return "pre/write";
    }
}
