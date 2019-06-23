package com.st.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.st.beans.Person;

public interface PersonRepository extends MongoRepository<Person, String> {

}
