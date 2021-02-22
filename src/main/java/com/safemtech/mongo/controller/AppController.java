package com.safemtech.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.safemtech.mongo.entity.Person;
import com.safemtech.mongo.repository.DataRepository;

@RestController
public class AppController {

	@Autowired
	private DataRepository repository;

	@PostMapping("/addPerson")
	public String addPerson(@RequestBody Person person) {
		repository.save(person);
		return "Successfully saved person with ID " + person.getId();
	}

	@GetMapping("/getAllPerson")
	public List<Person> getAllPersons() {
		return repository.findAll();
	}

	@GetMapping("/getPersonById/{id}")
	public Optional<Person> findPersonById(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/deleteById/{id}")
	public String deletePersonById(@PathVariable int id) {
		repository.deleteById(id);
		return "Successfully removed person with id " + id;
	}
}
