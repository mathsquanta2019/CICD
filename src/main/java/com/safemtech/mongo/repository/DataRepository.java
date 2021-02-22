package com.safemtech.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.safemtech.mongo.entity.Person;

@Repository
public interface DataRepository extends MongoRepository<Person, Integer>{

}
