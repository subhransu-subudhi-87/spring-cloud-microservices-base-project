package com.sss.cloud.account.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account-service")
public class AccountManagementController {
	
	@GetMapping("/status-check")
	public String status() {
	  return "Working!!!";	
	}

}
