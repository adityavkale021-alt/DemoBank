package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bank;
import com.example.demo.service.BankService;

@RestController
public class BankController {
	
	@Autowired
	private BankService ss;
	
	@GetMapping("/display")
	public List<Bank> displayBanks(){
		return ss.display();
	}
	@PostMapping
	public void addBank(Bank s) {
		ss.add(s);
	}

}
