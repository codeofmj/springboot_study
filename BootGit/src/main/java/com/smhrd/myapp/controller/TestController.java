package com.smhrd.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	@GetMapping("/")
	public String indexPage() {
		
		return "index";
	}
	
	@GetMapping("/boardPage")
	public String boardPage(Model model) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JSP/Servlet");
		list.add("Spring Framework");
		list.add("Spring Boot");
		
		model.addAttribute("list",list);
		
		return "board";
	}
}
