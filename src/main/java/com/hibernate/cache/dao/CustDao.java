package com.hibernate.cache.dao;

import java.util.List;

import com.hibernate.cache.entities.CustEntities;

public interface CustDao {
	public boolean insertCust (CustEntities entity);
	public List<CustEntities> getAllCust();
	public CustEntities getCust(int custId);
	public List<CustEntities> deleteCust(int custId);

}
