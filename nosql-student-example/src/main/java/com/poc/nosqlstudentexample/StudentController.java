package com.poc.nosqlstudentexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repo;

	@Transactional
	@PostMapping("/insert")
	public void save(@RequestBody Student student) {

		repo.save(student);
	}

}
