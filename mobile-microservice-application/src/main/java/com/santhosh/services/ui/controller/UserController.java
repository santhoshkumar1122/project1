package com.santhosh.services.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	public String getUser()
	{
		return "get user method was called";
	}
	
	public String createUser()
	{
		return"create user method was called";
		
	}
	
	public String updateUser()
	{
		return "update user naethod was called";
		
	}
	
	public String deleteUser()
	{
		return "delete user method was called";
	}

}
