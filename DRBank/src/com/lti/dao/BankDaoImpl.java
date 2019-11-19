package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.Banker_Info;
import com.lti.model.Internet_banking;

@Repository
public class BankDaoImpl implements BankDao {

	@PersistenceContext
	private EntityManager entityManager;

	
	public List<Internet_banking> UserLogin(String username, String password) {
		TypedQuery<Internet_banking> tquery= entityManager.createQuery("Select i From Internet_banking i where i.username=:u AND i.password=:p",Internet_banking.class);
		tquery.setParameter("u", username);
		tquery.setParameter("p", password);
		List<Internet_banking> userlist = tquery.getResultList();
		return userlist;
	}



	public List<Banker_Info> AdminLogin(String username, String password) {
		TypedQuery<Banker_Info> tquery= entityManager.createQuery("Select b From Banker_Info b where b.banker_email=:u AND b.banker_password=:p",Banker_Info.class);
		tquery.setParameter("u", username);
		tquery.setParameter("p", password);
		List<Banker_Info> userlist = tquery.getResultList();
		return userlist;
	}
	

}
