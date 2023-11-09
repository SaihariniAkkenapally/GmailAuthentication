package com.authentication.GmailAuthentication.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {
	@RequestMapping("/loginView")
	public String login() {
		return "login";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

//	@RequestMapping("/login/oauth2/code/google")
	@RequestMapping("/")
	public String handleGoogleAuthorization(@AuthenticationPrincipal OAuth2User user, Model model) {
		String name = user.getAttribute("name");
		String email = user.getAttribute("email");

		model.addAttribute("name", name);
		model.addAttribute("email", email);

		return "welcome";
	}

}
