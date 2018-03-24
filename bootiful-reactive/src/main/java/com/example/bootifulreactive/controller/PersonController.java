package com.example.bootifulreactive.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootifulreactive.domain.Person;
import com.example.bootifulreactive.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonController {

	PersonRepository personRepository;

	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	@GetMapping("/all")
	public List<Person> getAll(){
		List<Person> allPersons = this.personRepository.findAll();
		return allPersons;
	}
	
	@PutMapping("/insert")
	public void insertPersons(@RequestBody Person person) {
		this.personRepository.insert(person);
	}
	
	@PostMapping("/save")
	public void newPerson(@RequestBody Person person) {
		this.personRepository.save(person);
	}
	/*@GetMapping("/byId")
	public Person getById(@PathVariable String id) {
		
		Person preson = this.personRepository.findById(id);
	}*/
	@GetMapping("/angular")
	public String angularIntegrationTest() {
		return "Hello World";
	}
}
