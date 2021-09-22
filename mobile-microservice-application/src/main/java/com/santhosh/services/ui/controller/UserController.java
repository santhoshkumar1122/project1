package com.santhosh.services.ui.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.services.ui.model.response.UserRest;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page") int page,@RequestParam(value = "limit") int limit)
	{
		return "get users method was called with page =" + page + "and limit = "+ limit;
	}
	@GetMapping(path = "/{userId}",produces= 
		{
			MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE
		})
	public UserRest getUser(@PathVariable String userId) {
		
		UserRest response = new UserRest();
		response.setFirstName("santhosh");
		response.setLastName("kumar");
		response.setEmail("san@gmail.com");
		return response;
	}

	@PostMapping
	public String createUser() {
		return "create user method was called";

	}

	@PutMapping
	public String updateUser() {
		return "update user naethod was called";

	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user method was called";
	}

}
