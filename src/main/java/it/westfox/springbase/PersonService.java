package it.westfox.springbase;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private PersonRepository personRepository;

	PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public Optional<Person> findById(@NonNull Long id) {
		return personRepository.findById(id);
	}

	public List<Person> list() {
		return personRepository.findAll();
	}

	public Person save(@NonNull Person person) {
		return personRepository.save(person);
	}

	public void deleteById(@NonNull Long id) {
		personRepository.deleteById(id);
	}
}
