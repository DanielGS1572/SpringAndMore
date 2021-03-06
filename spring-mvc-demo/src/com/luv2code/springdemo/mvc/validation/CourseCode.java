package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	// define de attributes to pass in the annotation
	public String value() default "LUV";
	//defin default error message
	public String message() default "must start with LUV";
	//define default groups
	public Class<?>[] groups() default {};
	//define default payloas
	public Class<? extends Payload>[] payload() default{}; 
}
