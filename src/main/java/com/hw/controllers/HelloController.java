package com.hw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("welmsg","Welcome to Spring MVC");
		return "/welcome";
		
	}

}
