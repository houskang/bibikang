package com.hy.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Emp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer eid;
	private String ename;
	private String sex;
	private String address;
	private String bir;
	private String did;
	private Account acc;
	private Dept dept;
	private Set<Worked> worklist;

	/**
	 * @return the acc
	 */
	public Account getAcc() {
		return acc;
	}

	/**
	 * @param acc
	 *            the acc to set
	 */
	public void setAcc(Account acc) {
		this.acc = acc;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBir() {
		return bir;
	}

	public void setBir(String bir) {
		this.bir = bir;
	}

	/**
	 * @return the eid
	 */
	public Integer getEid() {
		return eid;
	}

	/**
	 * @param eid
	 *            the eid to set
	 */
	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Set<Worked> getWorklist() {
		return worklist;
	}

	public void setWorklist(Set<Worked> worklist) {
		this.worklist = worklist;
	}



}
