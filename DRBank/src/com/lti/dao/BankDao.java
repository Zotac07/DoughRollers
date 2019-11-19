package com.lti.dao;

import java.util.List;

import com.lti.model.Internet_banking;

public interface BankDao {
public List<Internet_banking> UserLogin(String username,String password);
public void UserRegistrationIb(String username,double accno,String password,int pin);
}
