package com.bridgelabz.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@GetMapping("/web")
	public void showMsg() {
		System.out.println("hello from showMsg()");
	}
}
