package com.xuebing.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testAction {
	@RequestMapping("/test")
	public String test() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		return "";
	}
}
