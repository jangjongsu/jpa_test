package com.jjcompany.jpa_test;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.jjcompany.jpa_test.dto.MemberDto;
import com.jjcompany.jpa_test.repasitory.MemberRepository;

@SpringBootTest
@TestPropertySource(locations = "classpath:application2.properties")
public class JpaTest {
	
	@Autowired
	MemberRepository memberRepository;
	
//	@Test
//	@DisplayName("이름검색 테스트")
//	public void searchName() {
//		List<MemberDto> memberDtos =  memberRepository.findByName("강아지");
//		
//		for(MemberDto memberDto : memberDtos) {
//			System.out.println(memberDto.toString());
//		}
//	}
	
//	@Test
//	@DisplayName("회원 탈퇴 테스트")
//	public void deleteMember() {
//		
//		memberRepository.deleteById(2L); //2번 맴버 삭제
//	}
//	@Test
//	@DisplayName("회원 리스트 테스트")
//	public void memberList() {
//		List<MemberDto> memberDtos =  memberRepository.findAll();//모든회원 리스트 가져오기
//		
//		for(MemberDto memberDto : memberDtos) {
//			System.out.println(memberDto.toString());
//		}
//	}
//	@Test
//	@DisplayName("회원정보 수정")
//	public void modifyMember() {
//		
//		Optional<MemberDto> optionalDto = memberRepository.findById(3L);
//		
//		if(optionalDto.isPresent()) { //null 값 여부 체크
//		
//		MemberDto memberDto = optionalDto.get();
//		
//		memberDto.setAge(32); // 나이 수정
//		memberDto.setName("상강아지"); // 나이 이름
//		
//		memberRepository.save(memberDto);
//		
//		optionalDto = memberRepository.findById(3L);
//		
//		System.out.println(optionalDto.get().toString());
//		}
//	}
	
//	@Test
//	@DisplayName("회원 성씨로 검색 테스트")
//	public void memberList() {
//		List<MemberDto> memberDtos =  memberRepository.findAllByNameStartingWith("강");//모든회원 리스트 가져오기
//		
//		for(MemberDto memberDto : memberDtos) {
//			System.out.println(memberDto.toString());
//		}
//	}
	@Test
	@DisplayName("회원 키워드로로 검색 테스트")
	public void memberList() {
		List<MemberDto> memberDtos =  memberRepository.findAllByNameLike("%강%");//모든회원 리스트 가져오기
		
		for(MemberDto memberDto : memberDtos) {
			System.out.println(memberDto.toString());
		}
	}

}
