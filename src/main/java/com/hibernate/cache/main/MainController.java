package com.hibernate.cache.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.cache.beans.CustBean;
import com.hibernate.cache.daoimpl.CustDaoImpl;
import com.hibernate.cache.entities.CustEntities;
import com.hibernate.cache.serviceimpl.CustServiceImpl;

public class MainController {

	public static void main(String[] args) {

		
		
		//CustBean b1 = new CustBean(66, "asd", "sda@sda.com");
		CustServiceImpl simpl = new CustServiceImpl();
		System.out.println(simpl.fetchCust(66));
	/*	CustEntities c1 = new CustEntities(1,"chester","ad@ad.com",null);
		CustEntities c2 = new CustEntities(23,"kime","asd@asd.com",null);
		CustEntities c3 = new CustEntities(33, "Dante", "dmc@dmc.com",null);
	
		CustDaoImpl cust = new CustDaoImpl();
		
		cust.insertCust(c1);
		cust.insertCust(c2);		
		cust.insertCust(c3);*/
		
		
		/*Entity to DaoImple*/
		
//		CustDaoImpl c1 = new CustDaoImpl();
			

	//	c1.deleteCust(33);
		
		
		
		
		/*//CustEntities c1 = new CustEntities(1,"chester","ad@ad.com");
		//CustEntities c2 = new CustEntities(23,"kime","asd@asd.com");
		CustEntities c3 = new CustEntities(33, "Dante", "dmc@dmc.com");
	
				
		Configuration cfg = new Configuration().configure();
		SessionFactory sfactory = cfg.buildSessionFactory();
		Session session = sfactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		System.out.println(session.get(CustEntities.class, 1));
		//System.out.println(session.get(CustEntities.class, 1));
		tr.commit();
	session.close();
	
	
	Session session1 = sfactory.openSession();
	
	Transaction tr1 = session1.beginTransaction();
	
	System.out.println(session1.get(CustEntities.class, 1));
	
	tr1.commit();
session1.close();*/
	// session closed 
		/*session.save(c1);
        session.save(c2);
		System.out.println(session.get(CustEntities.class, 1));// o/p : CustEntities [custId=1, custName=chester, custEmail=ad@ad.com]

		system.out.println(session.get(CustEntities.class, 2));// o/p :  null 
		System.out.println(session.load(CustEntities.class, 1));// o/p :  CustEntities [custId=1, custName=chester, custEmail=ad@ad.com]

		System.out.println(session.load(CustEntities.class, 2));//o/p : Object Not Found Exception
		session.persist(c1);
		
		session.saveOrUpdate(c2);
        
		
		List<CustEntities> custList = session.createCriteria(CustEntities.class).list();
        
        System.out.println(custList);
        */

//		//update & merge
//		
//		session.saveOrUpdate(c3);
//		tr.commit();
//		session.close(); // session closed 
//		
//		c3.setCustName("Joker"); // c3 in detached state
//		Session session1 = sfactory.openSession();
//        Transaction tx = session1.beginTransaction();
//
//        CustEntities c4= (CustEntities)session1.get(CustEntities.class, 33);
//		//session1.update(c3); // Exception org.hibernate.NonUniqueObjectException
//        session1.merge(c3); // merge the new change in the object
//		// session1.update(c3); // execute with exception  org.hibernate.NonUniqueObjectException
//        tx.commit();
//		session1.close();
		
	}

}
