package com.example.preparation1.board.service;

import com.example.preparation1.board.dto.BoardForm;
import com.example.preparation1.board.entity.Board;

import com.example.preparation1.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void add(BoardForm formData) {
        Board board = new Board();
        board.setTitle(formData.getTitle());
        board.setContent(formData.getContent());
        board.setAuthor(formData.getAuthor());

        boardRepository.save(board);

    }
}
