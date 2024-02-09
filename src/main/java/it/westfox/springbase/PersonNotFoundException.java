package it.westfox.springbase;

public class PersonNotFoundException extends RuntimeException {
	public PersonNotFoundException(Long id) {
		super(String.format("Could not find person [id: %d]", id));
	}
}
