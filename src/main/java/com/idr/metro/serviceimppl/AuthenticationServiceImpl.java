package com.idr.metro.serviceimppl;

import org.springframework.beans.factory.annotation.Autowired;

import com.idr.metro.entity.User;
import com.idr.metro.repository.AuthenticationRepository;
import com.idr.metro.service.AuthenticationService;
import org.springframework.stereotype.Service;

import com.idr.metro.entity.User;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	AuthenticationRepository authenticationRepository;

	@Override
	public User signup(User user) {
		String pswrd = user.getPassword();
		String Cpswrd = user.getConfirmPassword();
		if (pswrd.equals(Cpswrd)) {
			authenticationRepository.save(user);
			return user;
		} else {
			return null;
		}
	}

	@Override
	public User login(String userName, String password) {
	    User user = authenticationRepository.findByUserName(userName);
	    if (user != null && user.getPassword().equals(password)) {
	        return user;
	    } else {
	        return null;
	    }
	}
   
}
