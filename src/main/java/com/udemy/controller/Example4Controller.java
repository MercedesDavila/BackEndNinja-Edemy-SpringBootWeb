package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	
	private static final String EXAMPLE4_VIEW = "500";

	
	
	@GetMapping("/request4")
	public ModelAndView request4() {
		ModelAndView mav = new ModelAndView(EXAMPLE4_VIEW);
		return mav;
	}
}
