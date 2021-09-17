package com.example.CoronaTrackerService.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.CoronaTrackerService.Entities.UsersDTO;
import com.example.CoronaTrackerService.Modal.Users;

@Service
public interface UsersService {
  
	public ArrayList<UsersDTO> getUsersDetails();
	public UsersDTO createNewUser(Users user);
}
