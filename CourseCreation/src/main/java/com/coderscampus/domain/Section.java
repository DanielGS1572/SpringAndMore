package com.coderscampus.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Section {
	private Long id;
	private Course course;
	private String name;
	private Set<Lesson> lessons = new HashSet<>();
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="section")
	public Set<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(Set<Lesson> lessons) {
		this.lessons = lessons;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
