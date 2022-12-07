package com.pengsoo.board.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@SequenceGenerator(name = "aboard00_seq_gengerator",sequenceName ="aboard00_seq",allocationSize = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerBoard {

	
	@Id//id는 기본값
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 1000)
	private String content;
	
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDateTime createTime; 
	
	//두 테이블의 연관관계
	//다대다 ManyToMany
	//다대일 ManyToOne
	//일대일 OneToOne
	//일대다 OneToMany
	//er 다이어그램 참고
	@ManyToOne
	private QuestionBoard questionBoard;//테이블
	
}




