package cn.hncu.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hncu.example.dao.PersonRepository;
import cn.hncu.example.domain.Person;

@Service
@Transactional
public class MyService {
	
//	@Autowired
//	private MyDao dao;
//	
//	public MyService(MyDao dao) {
//		this.dao = dao;
//	}
//	
//	public void getPerson() throws Exception{
//		dao.getPerson();
//	}
	
	@Autowired
	private PersonRepository personRepository;
	
	
	public MyService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public Person getPerson(String name, String age) throws Exception{
		return personRepository.findByNameAndAge(name, age);
	}
	
	public List<Person> getAll() throws Exception{
		return personRepository.findAll();
	}
	
	public List<Person> findByName(String name) throws Exception{
		return personRepository.findByName("tongwenyuan");
	}
}
