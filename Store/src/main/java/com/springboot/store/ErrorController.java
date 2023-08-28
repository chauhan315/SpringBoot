package com.springboot.store;

import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	
	public String getErrorPath() {
		return "/error";
	}
	
	@RequestMapping("/error")
	public String error() {
		return "error";
		
	}
}
