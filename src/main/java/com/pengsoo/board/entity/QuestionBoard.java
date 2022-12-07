package com.pengsoo.board.entity;
//db에 관한 설정을 만드는 곳
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@SequenceGenerator(name = "qboard00_seq_gengerator",sequenceName ="qboard00_seq",allocationSize = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionBoard {
	
	
	@Id//id는 기본값
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; //게시판 번호
	
	@Column(length = 200)
	private String subject; //게시판 제목
	
	@Column(length = 1000) //255자 제한 해제. @Column(columnDefinition = "varchar(1000) default 'TEXT'")=기본 문자길이제한보다 길게 설정하는 법. 
	private String content; //게시판 내용
	
	
	@CreationTimestamp//날짜 자동 생성
	@Column(updatable=false)
	private LocalDateTime createTime; // 등록일

	
	@OneToMany(mappedBy = "questionBoard",cascade = CascadeType.REMOVE)//remove는 질문이 삭제되면 그 질문에 달린 답변들도 모두 삭제된다
//	private AnswerBoard answerBoard;
	private List<AnswerBoard> answerList;
}
