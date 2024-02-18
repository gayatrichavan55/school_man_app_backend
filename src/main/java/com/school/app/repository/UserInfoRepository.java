package com.school.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.school.app.model.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {

	public UserInfo findByEmail(String email);
}
