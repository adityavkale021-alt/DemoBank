package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.model.Bank;
import com.example.demo.model.repository.BankRepository;

public class BankServiceImpl implements BankService {

	@Autowired
	private BankRepository sr;
	
	@Override
	public void add(Bank s) {
		// TODO Auto-generated method stub
		sr.save(s);

	}

	@Override
	public List<Bank> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
