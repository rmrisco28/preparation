package com.example.preparation1.board.service;

import com.example.preparation1.board.entity.Board;
import com.example.preparation1.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardService {
    private final BoardRepository boardRepository;

    public void write(Board board) {
        board.setCreatedDate(LocalDateTime.now());
        board.setModifiedDate(LocalDateTime.now());
        boardRepository.save(board);
    }

    public List<Board> findAll() {
        return boardRepository.findAll();
    }


    public Board findById(Integer id) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당글이 없습니다." + id));
        return board;
    }
}
