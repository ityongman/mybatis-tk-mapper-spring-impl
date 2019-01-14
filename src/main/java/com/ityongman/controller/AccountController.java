package com.ityongman.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ityongman.model.AccountEO;
import com.ityongman.service.IAccountService;

@RestController
public class AccountController {
	@Autowired
	private IAccountService accountService ;
	
	@RequestMapping(name="/get", method=RequestMethod.GET)
	public AccountEO queryAccountById(@RequestParam("id") Long id) {
		AccountEO account = accountService.selectByKey(id);
		
		if(null != account) {
			return account ;
		} else {
			account = new AccountEO() ;
			
			account.setId(123L);
			account.setBalance(BigDecimal.valueOf(200));
			
			return account ;
		}
	}
}
