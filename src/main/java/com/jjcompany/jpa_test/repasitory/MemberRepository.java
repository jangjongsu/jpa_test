package com.jjcompany.jpa_test.repasitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jjcompany.jpa_test.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, Long>{
												//<엔티티 클래스의 타입, 기본키의 타입>
	public List<MemberDto> findByName(String name);
	
	public List<MemberDto> findAllByOrderByHakbunDesc();
	public List<MemberDto> findAllByNameStartingWith(String nameKeyWord);
	public List<MemberDto> findAllByNameEndingWith(String nameKeyWord);
	public List<MemberDto> findAllByNameLike(String nameKeyWord);
	
	
	@Transactional //딜리트할때는 Transactional어노테이션 추가
	public void deleteAllByName(String Name);
}
