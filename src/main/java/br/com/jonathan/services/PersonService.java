package br.com.jonathan.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.jonathan.model.Person;

@Service
public class PersonService {
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String person) {
		Person person1 = new Person();
		person1.setId(counter.incrementAndGet());
		person1.setFirstName("Joonathan");
		person1.setLastName("Silva");
		person1.setAddress("Mesquita - Rio de Janeiro - Brasil");
		person1.setGender("male");
		return person1;
	}
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person1 = new Person();
		person1.setId(counter.incrementAndGet());
		person1.setFirstName("Person name " + i);
		person1.setLastName("Last name " + i);
		person1.setAddress("Some address in Brasil " + i);
		person1.setGender("male");
		return person1;
	}
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
		
	}

}
