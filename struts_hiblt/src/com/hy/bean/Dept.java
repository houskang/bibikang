package com.hy.bean;

import java.io.Serializable;
import java.util.Set;

public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer did;
	private String dname;
	private String dcity;
	private Set<Emp> emplist;

	/**
	 * @return the did
	 */
	public Integer getDid() {
		return did;
	}

	/**
	 * @param did
	 *            the did to set
	 */
	public void setDid(Integer did) {
		this.did = did;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname
	 *            the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * @return the dcity
	 */
	public String getDcity() {
		return dcity;
	}

	/**
	 * @param dcity
	 *            the dcity to set
	 */
	public void setDcity(String dcity) {
		this.dcity = dcity;
	}

	public Set<Emp> getEmplist() {
		return emplist;
	}

	public void setEmplist(Set<Emp> emplist) {
		this.emplist = emplist;
	}

}
