package com.poc.nosqlstudentexample;

import com.oracle.nosql.spring.data.repository.NosqlRepository;

public interface StudentRepository extends NosqlRepository<Student, Long> {

	/*
	 * The Student table is searched by lastname and returns an iterable instance of
	 * the Student class.
	 */
	Iterable<Student> findByLastName(String lastname);
}
