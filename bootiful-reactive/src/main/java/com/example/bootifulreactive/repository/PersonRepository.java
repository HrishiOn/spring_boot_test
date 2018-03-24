package com.example.bootifulreactive.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.bootifulreactive.domain.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>{

}
