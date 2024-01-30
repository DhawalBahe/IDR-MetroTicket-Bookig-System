package com.idr.metro.service;

import com.idr.metro.entity.User;

public interface AuthenticationService {

	User signup(User user);

	User login(String userName, String password);

	
}
