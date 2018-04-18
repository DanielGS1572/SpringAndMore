package com.Daniel.HibernateTelusko.FetchTypes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="alienFetch")		
public class Alien {
	@Id
	private int aid;
	private String aName;
	@OneToMany(mappedBy="alien",fetch=FetchType.EAGER)
	private Collection<Laptop> laps = new ArrayList<Laptop>();
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public Collection<Laptop> getLaps() {
		return laps;
	}
	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}
	
	
	
}
