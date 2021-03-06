package com.johnabbott.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.test.model.Student;

@Service("toto1")
public class StudentServiceImpl implements StudentService {
	
	List<Student> listStudents;
	
	public StudentServiceImpl() {
		listStudents = new ArrayList<Student>();
		
		listStudents.add(new Student(1, "toto1", "popo1", 15));
		listStudents.add(new Student(2, "toto2", "popo2", 14));
		listStudents.add(new Student(3, "toto3", "popo3", 24));
		listStudents.add(new Student(4, "toto4", "popo4", 34));
	}
	
	public List<Student> getStudents(){
		return listStudents;
	}

	@Override
	public boolean addStudent(Student std) {
		std.setId(listStudents.size() + 1);
		listStudents.add(std);
		return true;
	}
}
