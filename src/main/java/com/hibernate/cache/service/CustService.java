package com.hibernate.cache.service;

import java.util.List;

import com.hibernate.cache.beans.CustBean;
import com.hibernate.cache.entities.CustEntities;

public interface CustService {

	public boolean addCust (CustBean bean);
	public List<CustBean> fetchAllCust();
	public CustBean fetchCust(int custId);
	public List<CustBean> removeCust(int custId);
	
	
}
