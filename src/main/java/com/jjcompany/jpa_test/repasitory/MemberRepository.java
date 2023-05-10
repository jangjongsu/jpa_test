package com.jjcompany.jpa_test.repasitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjcompany.jpa_test.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, Long>{
												//<엔티티 클래스의 타입, 기본키의 타입>
	public List<MemberDto> findByName(String name);
}
