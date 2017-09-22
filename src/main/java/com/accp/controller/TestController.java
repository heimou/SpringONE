package com.accp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/test")
public class TestController {
	
	@RequestMapping(value="/accp")
	public String test(){
		
		System.out.println("==================================");
		return "index";
	}
}
