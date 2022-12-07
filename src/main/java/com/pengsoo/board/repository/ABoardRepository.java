package com.pengsoo.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pengsoo.board.entity.AnswerBoard;

public interface ABoardRepository extends JpaRepository<AnswerBoard, Integer>{

	
}
