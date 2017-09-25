package com.coderscampus.domain;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Pizza {
	private Long id;
	private Order order;
	private Set<Topping> topping = new HashSet<>();
	
	private String size;
	private String crusType;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "pizzas")
	public Set<Topping> getTopping() {
		return topping;
	}
	public void setTopping(Set<Topping> topping) {
		this.topping = topping;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCrusType() {
		return crusType;
	}
	public void setCrusType(String crusType) {
		this.crusType = crusType;
	}
	
	
}
