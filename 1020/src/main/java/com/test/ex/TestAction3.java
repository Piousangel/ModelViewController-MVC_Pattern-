package com.test.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mybatis.vo.TestVO;

@Controller
public class TestAction3 {

	@RequestMapping("/ex3")
	public String ex3() {
		
		return "ex3";
	}
	
	@RequestMapping("/ex3_1")
	public void ex3_1(TestVO vo) {
		System.out.println(vo.getM_id()+"/"+vo.getM_pw());
	}
	
	
	//public void ex3_1(String s_id, String s_pw) {
	//	System.out.println(s_id+"/"+s_pw);
	//}
	
	
}
