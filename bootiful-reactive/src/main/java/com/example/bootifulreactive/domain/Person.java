package com.example.bootifulreactive.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="PersonDB")
public class Person{
	@Id
	private String id;
	private String name;
	private int age;
	private List<Cars> car;
	private List<Clothes> shirt;
	public Person(String name, int age, List<Cars> car, List<Clothes> shirt) {
		this.name = name;
		this.age = age;
		this.car = car;
		this.shirt = shirt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Cars> getCar() {
		return car;
	}
	public void setCar(List<Cars> car) {
		this.car = car;
	}
	public List<Clothes> getShirt() {
		return shirt;
	}
	public void setShirt(List<Clothes> shirt) {
		this.shirt = shirt;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
}
