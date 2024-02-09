package it.westfox.springbase;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	private final PersonService service;

	public PersonController(PersonService service) {
		this.service = service;
	}

	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable @NonNull Long id) {
		return service.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
	}

	@GetMapping("/person")
	public List<Person> getPerson() {
		return service.list();
	}

	@PostMapping("/person")
	public Person createPerson(@RequestBody @NonNull Person person) {
		return service.save(person);
	}

	@DeleteMapping("/person/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePerson(@PathVariable @NonNull Long id) {
		service.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
		service.deleteById(id);
	}
}
