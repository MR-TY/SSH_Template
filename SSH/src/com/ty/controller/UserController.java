package com.ty.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.entity.User;
import com.ty.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/helloworld")
	public String test(User user) {
		System.out.println(user);
		userService.save(user);
		System.out.println("success");
		return "NewFile";
	}
}
