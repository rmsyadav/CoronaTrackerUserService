package com.example.CoronaTrackerService.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CoronaTrackerService.Entities.UsersDTO;
import com.example.CoronaTrackerService.Modal.Users;
import com.example.CoronaTrackerService.Reposetories.UsersReposetories;
import com.example.CoronaTrackerService.Service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersReposetories userreposetries;
	
	@Override
	public ArrayList<UsersDTO> getUsersDetails() {
		// TODO Auto-generated method stub
		ArrayList<UsersDTO> array=userreposetries.findAllActiveUsers();
		
		return array;
	}

	@Override
	public UsersDTO createNewUser(Users user) {
		// TODO Auto-generated method stub
		UsersDTO userDTO=new UsersDTO(user.getUserId(),user.getUserName(),user.getEmailId(),user.getPassword());
		
		return userreposetries.save(userDTO);
	}
	

}
