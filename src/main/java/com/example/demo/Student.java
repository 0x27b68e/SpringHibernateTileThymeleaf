package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//Usung @ConfigurationProperties thay the @Value
@Component
@PropertySource("classpath:student.properties")
@ConfigurationProperties("student")
public class Student {
	
	private String name;
	private String clazz;
	
	private List<Integer> scores;
	
	private Address address;
	
//	class Address {
//		
//		private String street;
//		private String city;
//		
//		
//		public String getStreet() {
//			return street;
//		}
//		public void setStreet(String street) {
//			this.street = street;
//		}
//		public String getCity() {
//			return city;
//		}
//		public void setCity(String city) {
//			this.city = city;
//		}
//	};
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Integer> getScores() {
		return scores;
	}
	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}


/*@Component
@PropertySource("classpath:student.properties")
public class Student {
	
	@Value("${student.name}")
	private String name;
	@Value("${student.clazz}")
	private String clazz;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}*/
	
	

}
