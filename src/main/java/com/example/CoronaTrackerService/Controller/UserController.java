package com.example.CoronaTrackerService.Controller;


import java.util.ArrayList;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CoronaTrackerService.Entities.UsersDTO;
import com.example.CoronaTrackerService.Modal.Users;
import com.example.CoronaTrackerService.Service.UsersService;



@RestController
@RequestMapping("/v1/cta")
public class UserController {
    
	
	@Autowired
	UsersService usersService;
	private static final String APPLICATION_JSON="APPLICATION_JSON";
	@GetMapping("/featch/userDetails")
	public ResponseEntity<ArrayList<UsersDTO>> getUserDetails()
	{
		
		return new ResponseEntity<>(usersService.getUsersDetails(),HttpStatus.OK);
	}
	@PostMapping(value = "/create/user/{UUID}",consumes = {})
	public ResponseEntity<UsersDTO> createUser(@PathVariable("UUID") String uuid,@RequestBody Users user)
	{
		
		return new ResponseEntity<>(usersService.createNewUser(user,uuid),HttpStatus.OK);
	}
	
	@PostMapping(value = "/login/user",consumes = {})
	public ResponseEntity<Boolean> loginAuthentication(
			@NotBlank @RequestHeader(value = "emailId",required=true) String emailId,
			@NotBlank @RequestHeader(value = "password",required=true) String password)
	{
		
		
		return new ResponseEntity<>(Boolean.valueOf(usersService.loginAuthentication(emailId,password)),HttpStatus.OK);
	}
}
