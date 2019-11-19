package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="dr_banker_info")
public class Banker_Info {
	@Id
	private String banker_email;
	private String banker_password;
	private String banker_name;
	private String banker_ifsc;
	
	
	public Banker_Info(){
		
	}
	public Banker_Info(String banker_email, String password, String banker_name, String ifsc) {
		super();
		this.banker_email = banker_email;
		this.banker_password = password;
		this.banker_name = banker_name;
		this.banker_ifsc = ifsc;
	}


	public String getBanker_email() {
		return banker_email;
	}


	public void setBanker_email(String banker_email) {
		this.banker_email = banker_email;
	}



	public String getBanker_password() {
		return banker_password;
	}



	public void setBanker_password(String password) {
		this.banker_password = password;
	}



	public String getBanker_name() {
		return banker_name;
	}



	public void setBanker_name(String banker_name) {
		this.banker_name = banker_name;
	}



	public String getBanker_ifsc() {
		return banker_ifsc;
	}



	public void setBanker_ifsc(String ifsc) {
		this.banker_ifsc = ifsc;
	}



	@Override
	public String toString() {
		return "Banker_Info [banker_email=" + banker_email + ", password=" + banker_password + ", banker_name=" + banker_name
				+ ", ifsc=" + banker_ifsc + "]";
	}
	
	
	
	
}
