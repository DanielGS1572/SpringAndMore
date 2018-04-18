package com.Daniel.HibernateTelusko.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
	@OneToMany(mappedBy="student")					/*@OneToMany (mappedby para que no haga una tabla de mapeo*/
	private List<Laptop> laptopList = new ArrayList<Laptop>();
	
	
	public List<Laptop> getLaptopList() {
		return laptopList;
	}
	public void setLaptopList(List<Laptop> laptopList) {
		this.laptopList = laptopList;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
}
