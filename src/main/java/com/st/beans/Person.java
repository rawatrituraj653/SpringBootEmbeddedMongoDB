package com.st.beans;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	@Id
	private String id;
	private Integer pid;
	private String pname;
	private Double income;
	private String addr;
	
	public Person(Integer pid, String pname, Double income, String addr) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.income = income;
		this.addr = addr;
	}
	public Person() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pid=" + pid + ", pname=" + pname + ",  income=" + income
				+ ", addr=" + addr + "]";
	}
	
}
