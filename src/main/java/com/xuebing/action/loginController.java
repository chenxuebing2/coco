package com.xuebing.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xuebing.entity.user;
import com.xuebing.service.userService;

@Controller
public class loginController {
	@Autowired
	private userService userservice;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session, Model model, @RequestParam String username,
			@RequestParam String password) {
		System.out.println("!!!!!!!!!!!");
		user user = userservice.login(username, password);
		if (user != null) {
			session.setAttribute("user", user);
			return "index";
		}
		model.addAttribute("errInfo", "!!!!");
		return "login";
	}
}
