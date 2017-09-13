package cn.hncu.example.dao;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import cn.hncu.example.domain.Person;

@RepositoryDefinition(domainClass = Person.class, idClass = String.class)
public interface PersonRepository{
	
	Person findByNameAndAge(String name , String age);
	
	List<Person> findAll();
	
	List<Person> findByName(String name);
	
}
