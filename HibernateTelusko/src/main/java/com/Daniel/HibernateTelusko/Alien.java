package com.Daniel.HibernateTelusko;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity/*(name="alien_table")	Para cambiar el nombre en base de datos y del ENTITY y no sea el del POJO*/
@Table(name="alien_")			/*Table y Entity son cosas distintas, al cambiar unicamente Table(name) no se modifica el nobmre del entity*/
public class Alien {
	@Id
	private int aid;
	/*Si en la tabla ya se tiene una columna llamada aname y se anota con @transient, no elimina la columna, simplemente mete valor nulo*/
	/*Pero si se crea desde cero con transient no agrega la columna, si despues se quita el transient agrega la columna con todos los datos anteriores nulos*/
//	@Transient					
	private AlienName alienName;
	
	@Column(name="alien_color")
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
