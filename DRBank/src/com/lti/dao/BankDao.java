package com.lti.dao;

import java.util.List;

import com.lti.model.Banker_Info;
import com.lti.model.Internet_banking;

public interface BankDao {
public List<Internet_banking> UserLogin(String username,String password);
public List<Banker_Info> AdminLogin(String username,String password);
}
