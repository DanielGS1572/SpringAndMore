package com.Daniel.HibernateTelusko.Caching.FirstLevelCache;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="alien_cachingFLC")			
public class Alien {
	@Id
	private int aid;					
	private AlienName alienName;
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public AlienName getAlienName() {
		return alienName;
	}
	public void setAlienName(AlienName alienName) {
		this.alienName = alienName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + alienName + ", color=" + color + "]";
	}
	
}
