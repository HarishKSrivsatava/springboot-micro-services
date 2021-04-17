package io.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseAccountService implements AccountService{
	
	private final RiskAssessor riskAssessor;
	
	@Autowired
	public DatabaseAccountService(RiskAssessor riskAssessor){
		this.riskAssessor = riskAssessor;
	}
  
}
