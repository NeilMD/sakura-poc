package com.sakura.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sakura.poc.model.Bond;
import com.sakura.poc.service.BondService;

@Controller
@RequestMapping("/bond")
public class BondController {

	
	@Autowired
	private BondService bondService;
	
	@RequestMapping(value = "/get/All")
	public String getAll(Model model) {
		List<Bond> bonds = bondService.getAll();
		model.addAllAttributes(bonds);
		return "hello";
	}
}
