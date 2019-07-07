package com.javainuse.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class AdminController {
	
	@RequestMapping(value="/admin")
	public String display() {
		return "Hi admin...!";
	}
}
