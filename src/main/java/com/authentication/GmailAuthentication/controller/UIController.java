package com.authentication.GmailAuthentication.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/")
	public ModelAndView handleGoogleAuthorization(@AuthenticationPrincipal OAuth2User user) {
		String name = user.getAttribute("name");
		String email = user.getAttribute("email");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", name);
		modelAndView.addObject("email", email);
		modelAndView.setViewName("welcome");
		return modelAndView;
	}

}
