package com.icia.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.icia.member.dto.MemberDTO;
@Controller
public class MemberController {
	
	//회원가입 폼 출력
	@GetMapping("/member/join")
	public String memberJoinForm() {
		return "memberjoin";
}
	//회원가입 처리
	@PostMapping("/member/join")
	public String memberJoin(MemberDTO member) {
		return "memberlogin";
	}
	
}
