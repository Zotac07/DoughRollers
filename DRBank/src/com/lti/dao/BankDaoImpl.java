package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.Account_details;
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


	@Override
	public void UserRegistrationIb(String username,double accno, String password, int pin) {
			 TypedQuery<Account_details> tquery=entityManager.createQuery("Select a From Account_details a where a.acc_no=:accno",Account_details.class);
			 tquery.setParameter("accno", accno);
			 List<Account_details> acclist= tquery.getResultList();
			 if(acclist != null)
			 {
				 for(Account_details acc : acclist)
				 {
					 if(acc.getAcc_status()==0)
					 {
						 //insert
					 }
				 }
			 }
	}
	

}
