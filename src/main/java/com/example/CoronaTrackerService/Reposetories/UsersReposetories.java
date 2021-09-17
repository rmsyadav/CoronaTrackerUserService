package com.example.CoronaTrackerService.Reposetories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.CoronaTrackerService.Entities.UsersDTO;

@Repository
public interface UsersReposetories extends JpaRepository<UsersDTO, Integer> {
	
	@Query( value = "SELECT * FROM USERS", 
			  nativeQuery = true)
	ArrayList<UsersDTO> findAllActiveUsers();
	
}
