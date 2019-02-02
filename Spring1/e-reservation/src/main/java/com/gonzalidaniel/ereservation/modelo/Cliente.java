/**
 * 
 */
package com.gonzalidaniel.ereservation.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 * @author Danielgonzali
 * 
 */
@Data							  					//Con la anotación ya no es necesario poner los getters y setters
@Entity
@Table(name = "cliente")
public class Cliente {
		@Id
		@GeneratedValue(generator = "system-uuid")	//system-uuid es la forma autoincremental en postgress
		@GenericGenerator(name="system-uuid",strategy="uuid2")							//Especificación de hibernate, no de JPA 
		String idCliente;
		String nombreCliente;						//Incluso no es necesario poner los modificadores de acceso pues reconoce que es un POJO
		String appellidoCliente;
		String identificacionCliente;
		String direccionCliente;
		String telefonoCliente;
		String emailCliente;
		@OneToMany(mappedBy="cliente")									//Un cliente tiene muchas reservas, el mappedBy es la propiedad de reservas
		Set<Reserva> reservas;
		
		public Cliente(){
			
		}
}
