package com.gonzalidaniel.ereservation.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
 
/**
 * Clase que representa la tabla reservas
 * @author Danielgonzali
 *
 */
@Data
@Entity
@Table(name="reserva")
public class Reserva {
	@Id
	@GeneratedValue(generator = "system-uuid")	
	@GenericGenerator(name="system-uuid",strategy="uuid2")
	String idReserva;
	Date fechaIngresoReserva;
	Date fechaSalidaReserva;
	int cantidadPersonasReserva;
	String descripcionReserva;
	@ManyToOne
	@JoinColumn(name="idCliente")
	Cliente cliente;
	

}
