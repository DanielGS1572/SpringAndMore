package com.Daniel.Telusko.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
	@ManyToMany(mappedBy="studentList")
	private List<Laptop> laptopList = new ArrayList<Laptop>();
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
	public List<Laptop> getLaptopList() {
		return laptopList;
	}
	public void setLaptopList(List<Laptop> laptopList) {
		this.laptopList = laptopList;
	}
	
	 
	
}
