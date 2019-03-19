package com.hibernate.cache.entities;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/*@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
*/@Entity
@Table(name="CUST_INFO")
public class CustEntities {
   
	@Id
	private int custId;
	private String custName;
	private String custEmail;
	private String isActive;
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
		public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	@Override
	public String toString() {
		return "\n CustEntities [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", isActive="
				+ isActive + "]";
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public CustEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustEntities(int custId, String custName, String custEmail, String isActive) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.isActive = isActive;
	}
		
	
}
