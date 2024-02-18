package com.school.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.UserInfo;
import com.school.app.repository.UserInfoRepository;

@Service
public class UserService {

	@Autowired
	UserInfoRepository userInfoRepository;

	public void signUp(UserInfo userInfo) {

		userInfoRepository.save(userInfo);

	}

	public UserInfo login(String email) {
		
		UserInfo user = userInfoRepository.findByEmail(email);

		return user;

	}

}
