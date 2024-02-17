package com.school.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.app.model.UserInfo;
import com.school.app.request.model.ReqUser;
import com.school.app.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	

	@PostMapping("/signup")
	public ResponseEntity<?> signupUser(@RequestBody ReqUser reqUserData) {
		System.out.println(reqUserData.toString());
		
		UserInfo userInfo = new UserInfo();

	
		userInfo.setFullName(reqUserData.getFullName());
		userInfo.setEmail(reqUserData.getEmail());
		userInfo.setPassword(reqUserData.getPassword());
		
		System.out.println(userInfo.toString());
		
		userService.signUp(userInfo);

//		userService.signUp(userInfo);

		return ResponseEntity.status(HttpStatus.CREATED).body(true);
	}

	@GetMapping("/login/{email}")
	public String login(@PathVariable String email) {
		System.out.println(email);
		return new String("loged in");
	}

}
