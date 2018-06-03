package com.cfang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cfang.service.IUserInfoService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserInfoService userInfoService;
	
	@RequestMapping("/getUser")
	public void getUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
		userInfoService.updateUserInfo(null);
	}
}
