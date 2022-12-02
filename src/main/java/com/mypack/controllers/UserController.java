package com.mypack.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
import com.mypack.payloads.ApiResponse;
import com.mypack.payloads.UserDto;
import com.mypack.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	//Create user.....
	@PostMapping("/")
	public ResponseEntity<UserDto>createUser(@Valid @RequestBody UserDto userDto)
	{
		UserDto createdUser = userService.createUser(userDto);
	return new ResponseEntity<UserDto>(createdUser,HttpStatus.CREATED);	
	}
	
	
	//Get user....
	@GetMapping("/")
	public ResponseEntity<List<UserDto>>getAllUser()
	{
		List<UserDto> allUser = userService.getAllUser();
		if(allUser.size()<=0){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else
		{
			
			return ResponseEntity.of(Optional.of(allUser));
			//return ResponseEntity.ok(allUser);
		}
		
		
	}
	//Get User By id....
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto>getById(@PathVariable("userId") Integer uid)
	{
		UserDto userById = userService.getUserById(uid);
	//	return ResponseEntity.ok(userById);
		if(userById.getId()==uid)
		{
			return ResponseEntity.of(Optional.of(userById));
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	//Update user....
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable Integer userId)
	{
		UserDto updateUser = userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updateUser);
	}
	//Delete user....
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid)
	{
		userService.deleteUser(uid);
		
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully",true),HttpStatus.OK);
		}
}
