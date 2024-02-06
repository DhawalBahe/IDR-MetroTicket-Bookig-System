package com.idr.metro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idr.metro.entity.User;
import com.idr.metro.service.AuthenticationService;

@RestController
public class AuthenticationController {

	@Autowired
	AuthenticationService authenticationService;

	@PostMapping("/signup")
	public User Signup(@RequestBody User user) {
		return authenticationService.signup(user);
	}

	@PostMapping("/login")
	public ResponseEntity<User> Login(@RequestParam String UserName, @RequestParam String password) {
		User authenticatedUser = authenticationService.login(UserName, password);
		if (authenticatedUser != null) {
			return ResponseEntity.ok(authenticatedUser);
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}
	}
}
