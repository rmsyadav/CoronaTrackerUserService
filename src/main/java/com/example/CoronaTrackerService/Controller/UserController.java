package com.example.CoronaTrackerService.Controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/featch/userDetails")
	public ResponseEntity<ArrayList<UsersDTO>> getUserDetails()
	{
		
		return new ResponseEntity<>(usersService.getUsersDetails(),HttpStatus.OK);
	}
	@PostMapping("/create/user")
	public ResponseEntity<UsersDTO> createUser(@RequestBody Users user)
	{
		
		return new ResponseEntity<>(usersService.createNewUser(user),HttpStatus.OK);
	}
}
