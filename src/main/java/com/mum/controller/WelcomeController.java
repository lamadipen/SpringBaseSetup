package com.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	public WelcomeController() {
		// TODO Auto-generated constructor stub
		
	}
	@RequestMapping("/")
	public String index()
	{
		System.out.println("Here");
		return "index";
	}
}
