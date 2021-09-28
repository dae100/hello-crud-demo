package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.data.Publisher;
import com.example.demo.service.PublisherServiceImpl;

@Controller
public class HelloController {
	
	@Autowired
	PublisherServiceImpl repo;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		
		Publisher publisher = repo.getPublisherById(1);
		
		model.addAttribute("publisherName", publisher.getName());
		return "hello";
	}
}
