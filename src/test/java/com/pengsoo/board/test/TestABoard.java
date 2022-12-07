package com.pengsoo.board.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.pengsoo.board.entity.AnswerBoard;
import com.pengsoo.board.entity.QuestionBoard;
import com.pengsoo.board.repository.ABoardRepository;
import com.pengsoo.board.repository.QBoardRepository;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class TestABoard {

	@Autowired
	private QBoardRepository qBoardRepository;

	@Autowired
	private ABoardRepository aBoardRepository;
	
	@Test
	@DisplayName("답변 저장 테스트")
	public void AnswerCreatTest() {
		 Optional<QuestionBoard> oQboard = qBoardRepository.findById(6);
		 assertTrue(oQboard.isPresent());//6번 질문글이 존재하는지 테스트
		 
		 QuestionBoard qboard = oQboard.get();
		 
		 AnswerBoard aBoard = new AnswerBoard();
		 
		 aBoard.setContent("6번글 답변입니다.");//답변 테이블에  6번글 답변입니다.입력
		 aBoard.setQuestionBoard(qboard);
		 
		 aBoardRepository.save(aBoard);
	}
	@Test
	@DisplayName("답변 조회 테스트")
	public void AnswerSearch() {
	Optional<AnswerBoard> oAboard = aBoardRepository.findById(6);
	 assertTrue(oAboard.isPresent());
	AnswerBoard aBoard = oAboard.get();
	
	assertEquals(6, aBoard.getQuestionBoard().getId());
	//질문글의 아이디를 가져와서 확인
	
	}
	
	@Transactional
	@Test
	@DisplayName("답변과 질문 조회 테스트")
	public void answerQustionSearch() {
		 Optional<QuestionBoard> oQboard = qBoardRepository.findById(6);
		 assertTrue(oQboard.isPresent());//6번 질문글이 존재하는지 테스트
		 QuestionBoard qboard = oQboard.get();//6번 질문글 가져옴
		 
		   List<AnswerBoard> aBoards = qboard.getAnswerList();//답변글 리스트 가져오기
				   
		   assertEquals(3, aBoards.size());//질문 6번에 달린 답변 글의 개수가 총 3개인지 확인
	
	}	
	
}



