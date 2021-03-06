package com.poc.nosqlstudentexample;

import com.oracle.nosql.spring.data.core.mapping.NosqlId;
import com.oracle.nosql.spring.data.core.mapping.NosqlTable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@NosqlTable
public class Student {

	/*
	 * The @NosqlId annotation specifies that this field will act as the ID field.
	 * And the generated=true attribute specifies that this ID will be
	 * auto-generated by a sequence.
	 */
	@NosqlId(generated = true)
	long id;
	
	
	String firstName;
	String lastName;

	/*
	 * This method overrides the toString() method, and then concatenates id,
	 * firstname, and lastname, and then returns a String
	 */
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", " + "firstName=" + firstName + ", " + "lastName=" + lastName + '}';
	}
}
