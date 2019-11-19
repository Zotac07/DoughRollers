package com.lti.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lti.service.BankService;

@Controller

public class BankController {
	@Autowired
	private BankService service;
	
	@RequestMapping(path = "/")
	public String UserloginPage() {
		return "Login";
	}

	@RequestMapping(path = "login", method = RequestMethod.POST)
	public String Userlogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		boolean result = service.readUserLogin(username, password);
		if (result) {
			return "userdashboard";
		}
		return "redirect: wrong.do";
	}

	@ResponseBody
	@RequestMapping(path="wrong.do")
	public String InvalidCredentials(HttpServletResponse response) {
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		return "Invalid Credentials";
	}
	@RequestMapping(path = "/AdminLoginPage")
	public String AdminloginPage() {
		return "AdminLogin";
	}

	@RequestMapping(path="Adminlogin", method = RequestMethod.POST)
	public String AdminLogin(@RequestParam("email") String email, @RequestParam("password") String password){
		boolean result= service.readAdminLogin(email,password);
		if (result) {
			return "userdashboard";
		}
		return "redirect: wrong.do";
	}
}
