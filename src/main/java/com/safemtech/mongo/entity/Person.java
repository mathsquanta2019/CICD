package com.safemtech.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Document(collection = "person")
public class Person {

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private int salary;
	private String almaMata;

}

