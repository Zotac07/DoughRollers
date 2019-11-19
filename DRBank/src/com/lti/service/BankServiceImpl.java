package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BankDao;
import com.lti.model.Banker_Info;
import com.lti.model.Internet_banking;
@Service
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDao dao;
	@Override
	public boolean readUserLogin(String username, String password) {
		List<Internet_banking> userlist=dao.UserLogin(username, password);
		for(Internet_banking i: userlist)
		{
			if(i.getLock_status()==0)
			{
				return true;
			}
		}
		return false;
	}

	public boolean readAdminLogin(String email, String password) {
		List<Banker_Info> userlist=dao.AdminLogin(email, password);
			if(userlist==null)
			{
				return false;
			}
	
		return true;
	}

}
