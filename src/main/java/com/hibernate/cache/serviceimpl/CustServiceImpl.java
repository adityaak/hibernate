package com.hibernate.cache.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.cache.beans.CustBean;
import com.hibernate.cache.dao.CustDao;
import com.hibernate.cache.daoimpl.CustDaoImpl;
import com.hibernate.cache.entities.CustEntities;
import com.hibernate.cache.service.CustService;

public class CustServiceImpl implements CustService{

	
	
	static CustDao custDao = null;
	public CustServiceImpl() {
		super();
		custDao = new CustDaoImpl();
	}
	
	private CustEntities ConvertBeanToEntity (CustBean bean) {
		CustEntities entity = new CustEntities();
		entity.setCustId(bean.getCustId());
		entity.setCustName(bean.getCustName());
		entity.setCustEmail(bean.getCustEmail());
				
		return entity;
				
	}
	
	private CustBean ConvertEntityToBean (CustEntities entity) {
		CustBean bean = new CustBean();
		bean.setCustId(entity.getCustId());
		bean.setCustName(entity.getCustName());
		bean.setCustEmail(entity.getCustEmail());
		return bean;
	}
	
	private List<CustBean> ConvertEntitiesToBean (List<CustEntities> entities){
		
		List<CustBean> beans = new ArrayList<CustBean>();
		for(CustEntities entity: entities) {
			beans.add(ConvertEntityToBean(entity));
		}
		
		return beans;
	}
	
	



	public boolean addCust(CustBean bean) {
        
		CustEntities entity = ConvertBeanToEntity(bean);
				
		return custDao.insertCust(entity);
	}

	public List<CustBean> fetchAllCust() {

		List<CustEntities> en = custDao.getAllCust();
		List<CustBean> beans = ConvertEntitiesToBean(en);
		return beans;
	}

	public CustBean fetchCust(int custId) {
       

		CustEntities entity = custDao.getCust(custId);
		CustBean beans = ConvertEntityToBean(entity);
		
		return beans;
	}

	public List<CustBean> removeCust(int custId) {
		// TODO Auto-generated method stub
		return null;
	}


}
