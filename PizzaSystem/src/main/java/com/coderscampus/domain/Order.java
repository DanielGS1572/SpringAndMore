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
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	private Long id;
	private Customer customer;
	private Set<Pizza> pizzas = new HashSet<>();
	private Double finalPrice;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne			//Customer 1 -> * Order -- ver como Order es el hijo, por eso es ManyToOne (Una orden no puede existir sin un cliente)
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "order")		//Una pizza no puede existir sin una orden por lo que el padre es la orden -> OneToMany, por eso en mapped by se pone order pues es el padre
	public Set<Pizza> getPizzas() {
		return pizzas;
	}
	public void setPizzas(Set<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	public Double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	
}
