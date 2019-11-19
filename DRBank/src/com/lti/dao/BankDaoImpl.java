package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

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
	

}
