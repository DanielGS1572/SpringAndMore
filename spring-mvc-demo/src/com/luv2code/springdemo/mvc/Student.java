package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String countryValue;
	private String favoriteLanguage;
	private List<String> operatingSystems;

	
	
	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getCountryValue() {
		return getCountryOptions().get(getCountry());
	}

	public void setCountryValue(String countryValue) {
		this.countryValue = countryValue;
	}

	private LinkedHashMap<String, String> countryOptions;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("MX", "Mexico");
		
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

}
