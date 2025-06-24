package com.example.preparation1.board.controller;

import com.example.preparation1.board.entity.Board;
import com.example.preparation1.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

    private final BoardRepository boardRepository;

    @GetMapping("write")
    public String write() {

        return "board/write";
    }

    @PostMapping("write")
    public String writePost(Board board) {
        board.setTitle();
        boardRepository.save(board);
        return "board/write";
    }

    @GetMapping("list")
    public String list() {
        return "board/list";
    }
}
