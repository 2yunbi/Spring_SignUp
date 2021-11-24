package com.mycompany.myapp.member.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.myapp.member.model.service.MemberService;
import com.mycompany.myapp.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/signUp")
	public String signUp(Member mvo, Model model) {
		int result = -1;
		try {
			result = memberService.signUp(mvo);
			if(result == 1) {
				model.addAttribute("msg", "회원가입 성공");
			}else {
				model.addAttribute("msg", "회원가입 실패");
			}
		}catch (Exception e) {
			model.addAttribute("msg", "회원가입 과정에서 오류 발생");
			e.printStackTrace();
		}
		return "redirect:/";
	}
}
