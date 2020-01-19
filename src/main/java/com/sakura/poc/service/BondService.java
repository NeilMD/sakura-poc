package com.sakura.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakura.poc.model.Bond;
import com.sakura.poc.repository.BondRepository;

@Service
public class BondService {

	@Autowired
	private BondRepository bondRepository;
	
	public List<Bond> getAll(){
		return (List<Bond>)bondRepository.findAll();
	}
}
