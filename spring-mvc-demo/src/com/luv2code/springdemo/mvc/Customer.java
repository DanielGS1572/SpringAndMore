package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {

	
	private String firstName;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@Min(value=0, message = "must be greater or equal zero")
	@Max(value=10, message = "must be less or equeal to 10")
	@NotNull(message="is required")
	private Integer freePasses; //--> debe ser el wrapper  para que funcione el NotNull
	//en el campo de freePasses pueden meter texto, pero al darle submit manda un mensaje de error feo, por lo que se tiene que 
	//poner un mensaje customizado  --> src/resources/messages.prporties --> cargar el archivo en spring --> WebContent/WEB-INF/spring-mvc-demo-servlet.xml
	
	
	//al imprimir bindingResult en CustomerController se pueden ver los mensajes de error que manejan:
	//typeMismatch.customer.freePasses,typeMismatch.freePasses,typeMismatch.java.lang.Integer,typeMismatch
	// y al ponerlos en un archivo de .properties se hace override sobre estos errores
	
	@CourseCode(value = "TOPS")
	private String courseCode;
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
	
	
}
