package com.jjcompany.jpa_test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jjcompany.jpa_test.dto.MemberDto;
import com.jjcompany.jpa_test.repasitory.MemberRepository;

@Controller
public class HomeController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@RequestMapping(value = "/join")
	public String join() {
		return "join";
	}
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int grade = Integer.parseInt(request.getParameter("grade"));
		String etc = request.getParameter("etc");
		
		MemberDto memberDto = new MemberDto();
		
		memberDto.setName(name);
		memberDto.setAge(age);
		memberDto.setGrade(grade);
		memberDto.setEtc(etc);
		
		memberRepository.save(memberDto);
		
		return "joinOk";
	}

}
