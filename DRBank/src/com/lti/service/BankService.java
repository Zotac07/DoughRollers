package com.lti.service;

public interface BankService {
public boolean readUserLogin(String username,String password);
public void CreateUserIb(String username,double accno,String password,int pin);
}
