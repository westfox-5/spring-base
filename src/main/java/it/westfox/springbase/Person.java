package it.westfox.springbase;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person {

	private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
	private String name;

	Person() {
	}

	public Person(String name) {
		this.name = name;
	}

}
