package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="dr_internet_banking")
public class Internet_banking {
	@Id
	private String username;
	private int customer_id;
	private int pin;
	private int lock_status;
	private String password;
	
	
	public Internet_banking() {
		super();
	}
	
	
	public Internet_banking(String username, int customer_id, int pin, int lock_status, String password) {
		super();
		this.username = username;
		this.customer_id = customer_id;
		this.pin = pin;
		this.lock_status = lock_status;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getLock_status() {
		return lock_status;
	}
	public void setLock_status(int lock_status) {
		this.lock_status = lock_status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Internet_banking username=" + username + ", customer_id=" + customer_id + ", pin=" + pin
				+ ", lock_status=" + lock_status + ", password=" + password ;
	}
	
	
}
