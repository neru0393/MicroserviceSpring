package com.esmt.m223isi.microservices.userauthentificationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.esmt.m223isi.microservices.userauthentificationservice.bean.UserService;

@RestController
public class UserController {
	
	@GetMapping ("/user-authentification")
	public UserService getUserCredential()
	{
			return new UserService("login", "password");
	}

}
