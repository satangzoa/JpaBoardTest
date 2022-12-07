package com.pengsoo.board.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

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
public class TestQBoard2 {

	@Autowired
	QBoardRepository qBoardRepository;
	
	@Autowired
	private ABoardRepository aBoardRepository;
	
	
	@Test
	@DisplayName("저장 테스트")
	public void createQBoard() {
		QuestionBoard qBoard = new QuestionBoard();
		
		qBoard.setSubject("안냥");
		qBoard.setContent("안냥");
		
		
		qBoardRepository.save(qBoard);
	}
//	
//	@Test
//	@DisplayName("조회 테스트1")
//	public void searchQustion1() {
//		
//		 List<QuestionBoard> qAll = qBoardRepository.findAll();// 반환타입은 리스트
//		
//		 assertEquals(5, qAll.size());//qAll.size()는 실제. 실제 모든 글의 갯수와 기대한 값인 2개가 일치하는 지 여부 확인//5는 기대값
//		 
//		 QuestionBoard q1= qAll.get(1);
//		 assertEquals("질문2개 있지롱" , q1.getSubject()); 
//	}
	
//	@Test
//	@DisplayName("조회 테스트2")
//	public void searchQustion2() {
//		
//		 Optional<QuestionBoard> qBoard = qBoardRepository.findById(2);//findById는 기본키
//		 
//		 if(qBoard.isPresent()) {
//			QuestionBoard q1 = qBoard.get();
//			 assertEquals("질문2개 있지롱" , q1.getSubject()); 
//	}
//	
	
//	@Test
//	@DisplayName("조회 테스트3")
//	public void searchQustion3() {//'질문임' 제목으로 조회. 조회된 글의 아이디 기대값은 6 기대한 아이디 값인 6과 실제값이 일치하는지 테스트
//		
//		
//		List<QuestionBoard> qBoards = qBoardRepository.FindBySubject("질문임");
//		 
//		QuestionBoard q1 = qBoards.get(0);
//		assertEquals(6 , q1.getId()); 
//		}
//	
//	@Test
//	@DisplayName("조회 테스트4")
//	public void searchQustion4() {// 제목과 질문이 모두 '안뇽'인  글의 아이디가 6인지 테스트
//		
//		List<QuestionBoard> qBoards2 = qBoardRepository.FindBySubjectAndContent("안뇽", "안뇽");
//		 
//		QuestionBoard q2 = qBoards2.get(0);//get(0)은 첫번째
//		assertEquals(6 , q2.getId()); 
//		}
////	
//	@Test
//	@DisplayName("조회 테스트5")
//	public void searchQustion5() {// 제목에 '질문'이라는 낱말이 포함된 글의 개수가 5인지 테스트
//		
//		
//		List<QuestionBoard> qBoards3 = qBoardRepository.findByNameContaining("%질문%");
//		 
//		assertEquals(5 , qBoards3.size()); 
//		}
//	
//	@Test
//	@DisplayName("조회 테스트6")
//	public void searchQustion6() {// 아이디가 2번인 글의 제목을 '저는 2번글입니다'로 수정.2번 아이디 글의 제목이 제대로 수정되었는지 테스트
//		
//		
//		List<QuestionBoard> qBoards3 = qBoardRepository.findById(2);
//		 
//		
//		
//		}
	
//	@Test
//	@DisplayName("조회 테스트7")
//	public void deleteQustion() {// 아이디가 3번인 글을 삭제. 글을 삭제한 후 모든 글의 개수가 1개 줄었는지 테스트
//		
//		
//		 qBoardRepository.deleteById(3);
//		 List<QuestionBoard> deleteQBoard = qBoardRepository.findAll();
//		 
//		 qBoardRepository.saveAll(deleteQBoard);
//		
//		System.out.println();
//		}
//	 @Test
//	   @DisplayName("테스트 문제2")
//	   public void searchQustion4() {// 제목과 질문이 모두 '안뇽'인  글의 아이디가 6인지 테스트
//	      
//	      List<QuestionBoard> qBoards2 = qBoardRepository.FindBySubjectAndContent("안뇽", "안뇽");
//	       
//	      QuestionBoard qBoards = qBoards2.get(0);
//	      assertEquals(6 , qBoards.getId()); 
//	      }
//	   
//
//	//   1) 제목에 '질문'이라는 낱말이 포함된 글의 개수가 5인지 테스트하시오.
//
//	   @Test
//	   @DisplayName("테스트 문제3")
//	   public void searchQuestion1() {
//	      
//	      List<QuestionBoard> qAll = qBoardRepository.findByNameLike("%질문%");
//	      assertEquals(5, qAll.size()); //실제 모든 글의 개수와 기대한 값인 5개가 일치하는지 여부 확인
//	      
//	   }
	//   1) 아이디가 2번인 글의 제목을 '저는 2번글입니다'로 수정하시오.
	//   2) 2번 아이디글의 제목이 제대로 수정되었는지 테스트하시오.
//	   @Test
//	   @DisplayName("수정 테스트")
//	   public void modifyQuestion() {
//
//		   Optional<QuestionBoard> oResult =  qBoardRepository.findById(2);// 반환값이 null 일수도 있어서 Optional사용
//	      QuestionBoard qResult = oResult.get();
//	      qResult.setSubject("저는 2번글입니다");
//	      QuestionBoard qr= qBoardRepository.save(qResult);
//	      assertEquals("저는 2번글입니다", qr.getSubject());
//	   }
	   

	//1) 아이디가 3번인 글을 삭제하시오.
	//2) 글을 삭제한 후 모든 글의 개수가 1개 줄었는지 테스트하시오.

//	   @Test
//	   @DisplayName("테스트 문제5")
//	   public void deleteQuestion() {
//	      
//		   List<QuestionBoard> qAll = qBoardRepository.findAll();
//		   int qAllSize = qAll.size();//모든 글의 개수
//		   Optional<QuestionBoard> oResult = qBoardRepository.findById(3);//아이디가 3번 글인 글 조회
//	      QuestionBoard qResult = oResult.get();//3번 글 가져오기 완료
//	      
//	      qBoardRepository.delete(qResult);
//	      
//	      qAll = qBoardRepository.findAll();
//	      int qAllSize2 = qAll.size();//모든 글의 개수
//	      assertEquals(qAllSize2, qAllSize-1);
//	   }
	   
	   }


	



