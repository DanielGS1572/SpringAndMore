package com.Daniel.HibernateTelusko.Query.HQL1;

import javax.persistence.Embeddable;

@Embeddable							/*@Embeddable hace que se agreguen columnas de todas las propiedades que son objetos*/ 			
public class AlienName {
	/*Ver que no lleva id, pues simplemente se esta embebiendo en el objeto Alien*/
	private String fname;
	private String lname;
	private String mname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	
}
