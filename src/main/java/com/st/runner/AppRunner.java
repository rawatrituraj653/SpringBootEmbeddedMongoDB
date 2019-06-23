package com.st.runner;

import java.util.Arrays;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.beans.Person;
import com.st.repo.PersonRepository;

@Component
public class AppRunner implements CommandLineRunner{
	
	@Autowired	
	private PersonRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.getClass().getClassLoader().getClass().getName());
		System.out.println(UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase());
		Person p=new Person(101, "Sumit", 40000.00, "India");
		repo.deleteAll();
		System.out.println("all deleted");
		repo.save(p);
		System.out.println("one inserted");
		repo.saveAll(Arrays.asList(
				new Person(102, "Adam", 30000.00, "USA"),
				new Person(103, "Miller", 45000.00, "Aus"),
				new Person(104, "Scott", 33000.00, "Ger"),
				new Person(105, "Allen", 28000.00, "Fra"),
				new Person(106, "Jones", 47000.00, "RSA")
				));
		System.err.println("employee list is sotred");
		repo.findAll().forEach(System.out::println);
		
	}
}