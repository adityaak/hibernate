package com.hibernate.cache.beans;

public class CustBean {

	private int custId;
	private String custName;
	private String custEmail;
	public CustBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustBean(int custId, String custName, String custEmail) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
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
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	@Override
	public String toString() {
		return "\n CustBean [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + "]";
	}
	
}
