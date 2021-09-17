package com.example.CoronaTrackerService.Reposetories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.CoronaTrackerService.Entities.UsersDTO;

@Repository
public interface UsersReposetories extends JpaRepository<UsersDTO, Integer> {
	
	@Query( value = "SELECT * FROM USERS", 
			  nativeQuery = true)
	ArrayList<UsersDTO> findAllActiveUsers();
	
	@Query(value ="SELECT * FROM USERS WHERE EMAILID= ?1 and PASSWORD= ?2",nativeQuery = true)
	
	UsersDTO findUserByEmailIDAndPassword(String emailId,String password);
	
}
