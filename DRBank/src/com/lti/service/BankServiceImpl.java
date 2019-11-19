package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BankDao;
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
	@Override
	public void CreateUserIb(String username,double accno, String password, int pin) {
		// TODO Auto-generated method stub
		
	}

}
