package com.example.bootifulreactive.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.bootifulreactive.domain.Cars;
import com.example.bootifulreactive.domain.Clothes;
import com.example.bootifulreactive.domain.Person;

@Component
public class PersonRepoSeeder implements CommandLineRunner{

	PersonRepository personRepo;
	
	public PersonRepoSeeder(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Person hrishi = new Person( 
				"HA", 
				29, 
				Arrays.asList(
						new Cars("MB", 215.125)), 
				Arrays.asList(
						new Clothes("Levis", "XL"),
						new Clothes("Zara", "XL"))
				);
		Person shivani = new Person(
				"SD", 
				24, 
				Arrays.asList(
						new Cars("VW", 4512.258), 
						new Cars("MC", 66.235689)),
				Arrays.asList(
						new Clothes("Sabyasachi", "L"),
						new Clothes("Gavaksh", "XL"))
				);
		Person jonny = new Person(
				"JS", 
				4, 
				Arrays.asList(
						new Cars("JEEP", 512.258), 
						new Cars("MC", 668.29989)),
				new ArrayList<>()
				);
		//Adding hotels to database
		this.personRepo.deleteAll();
		//Populate hotels at startup
		List<Person> somePersons = Arrays.asList(hrishi,shivani,jonny);
		this.personRepo.saveAll(somePersons);
	}
	

}
