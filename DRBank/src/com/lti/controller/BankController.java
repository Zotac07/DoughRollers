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
		return "Home";
	}
	@RequestMapping(path = "loginpage")
	public String LoginPage()
	{
		return "Login";
	}
	@RequestMapping(path = "login.do", method = RequestMethod.POST)
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
	@RequestMapping(path="registeruser")
	public String RegisterIBPage()
	{
		return "RegisterForIB";
	}
	
	@RequestMapping(path="registerib.do")
	public String RegisterIB(@RequestParam("username") String username ,@RequestParam("account_number") double accno ,@RequestParam("password") String password,@RequestParam("transaction_pin") int pin)
	{
		
		return "";
	}
}
