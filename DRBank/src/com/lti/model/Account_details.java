package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="dr_account_details")
public class Account_details {
	@Id
	private double acc_no;
	private String acc_type;
	private String ifsc;
	private double balance;
	private long customer_id;
	private int acc_status;
	private String dateofcreation;
	
	public Account_details(double acc_no, String acc_type, String ifsc, double balance, long customer_id,
			int acc_status, String dateofcreation) {
		super();
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.ifsc = ifsc;
		this.balance = balance;
		this.customer_id = customer_id;
		this.acc_status = acc_status;
		this.dateofcreation = dateofcreation;
	}
	public Account_details() {
		super();
	}
	public double getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(double acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public int getAcc_status() {
		return acc_status;
	}
	public void setAcc_status(int acc_status) {
		this.acc_status = acc_status;
	}
	public String getDateofcreation() {
		return dateofcreation;
	}
	public void setDateofcreation(String dateofcreation) {
		this.dateofcreation = dateofcreation;
	}
}
