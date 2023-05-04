package com.jjcompany.jpa_test.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA
@Entity //MemberDto클래스를 엔티티로 선언
@Table(name="jpa_member") //엔티티와 매핑할 DB 테이블 이름 지정


//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
	@Id // 매핑될 DB테이블의 기본키로 아래 속성값이 설정됨
	@Column(name="hakbun") //실제 DB테이블의 필드 이름
	@GeneratedValue(strategy = GenerationType.AUTO) // 기본키 생성 전략(자동으로 번호를 생성 입력)
	private long hakbun;//학번 기본키
	
	@Column(name="name", nullable=false, length=20)
	private String name; //이름
	
	@Column(name="age")
	private int age; //나이
	
	@Column(name="grade")
	private int grade;//학년
	
	@Column(name="etc", length=100)
	private String etc;//기타 회원 설명
	
}
