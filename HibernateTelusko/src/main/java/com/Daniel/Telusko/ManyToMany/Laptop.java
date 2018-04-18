package com.Daniel.Telusko.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {
		
		@Id
		private int lid;
		private String lname;
		@ManyToMany
		private List<Student> studentList = new ArrayList<Student>();
		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public List<Student> getStudentList() {
			return studentList;
		}
		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}
		
		
		
		
		
}
