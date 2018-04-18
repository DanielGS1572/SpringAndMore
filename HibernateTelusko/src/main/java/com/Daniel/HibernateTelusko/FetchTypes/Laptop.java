package com.Daniel.HibernateTelusko.FetchTypes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="laptopFetch")
public class Laptop {
		
		@Id
		private int lid;
		private String brand;
		private int price;
		@ManyToOne
		private Alien alien;
		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public Alien getAlien() {
			return alien;
		}
		public void setAlien(Alien alien) {
			this.alien = alien;
		}
		

		
		

}
