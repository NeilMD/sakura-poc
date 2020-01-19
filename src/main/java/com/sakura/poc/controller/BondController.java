package com.sakura.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BondController {

	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String test() {
		System.out.println("TEST");
		return "hello";
	}
}
