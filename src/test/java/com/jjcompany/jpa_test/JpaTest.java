package com.jjcompany.jpa_test;

import java.util.List;

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
	
	@Test
	@DisplayName("이름검색 테스트")
	
	public void searchName() {
		List<MemberDto> memberDtos =  memberRepository.findByName("강아지");
		
		for(MemberDto memberDto : memberDtos) {
			System.out.println(memberDto.toString());
		}
	}

}
