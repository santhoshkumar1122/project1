package com.santhosh.services.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.services.ui.model.response.UserRest;
import com.santhosh.services.ui.request.UserDetailsRequestModel;

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
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
		
		UserRest response = new UserRest();
		response.setFirstName("santhosh");
		response.setLastName("kumar");
		response.setEmail("san@gmail.com");
		return new ResponseEntity<UserRest>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping
	(consumes = {
			MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE
	},
	produces = {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	}
			)
	public ResponseEntity<UserRest> createUser(@RequestBody UserDetailsRequestModel userDetails) {
		UserRest response =new UserRest();
		response.setEmail(userDetails.getEmail());
		response.setFirstName(userDetails.getFirstName());
		response.setLastName(userDetails.getLastName());;
		
	return new ResponseEntity<UserRest>(response,HttpStatus.OK);

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
