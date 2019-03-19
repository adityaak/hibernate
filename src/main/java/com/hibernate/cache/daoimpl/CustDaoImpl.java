package com.hibernate.cache.daoimpl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.cache.dao.CustDao;
import com.hibernate.cache.entities.CustEntities;
import com.hibernate.cache.util.HibernateUtil;

public class CustDaoImpl implements CustDao{
	
	SessionFactory sf= HibernateUtil.getSessionfactory();

	public boolean insertCust(CustEntities entity) {
		
		Session s1=sf.openSession();
		Transaction tr = s1.beginTransaction();
		
		entity.setIsActive("True");
		
		s1.save(entity);
		
		
		tr.commit();
		s1.close();
		
		return true;
		
		
	}

	public List<CustEntities> getAllCust() {
		Session s2= sf.openSession();
		Transaction tr = s2.beginTransaction();
		
		List<CustEntities> CustList = s2.createCriteria(CustEntities.class).list();
		tr.commit();
		s2.close();
		return CustList;
	}

	public List<CustEntities> deleteCust(int custId) {
		
		Session s3 = sf.openSession();

		CustEntities en = (CustEntities) s3.get(CustEntities.class, custId);
		Transaction tr = s3.beginTransaction();
		
		
		en.setIsActive("False");
		s3.saveOrUpdate(en);
		tr.commit();
		s3.close();
		return null;
	}

	public CustEntities getCust(int custId) {
		Session s4 = sf.openSession();
		Transaction tr = s4.beginTransaction();
		
        return (CustEntities)s4.get(CustEntities.class, custId);
		
		
		
	}

}
