package com.test.school.Student;

import java.util.Optional;

public interface IEstudianteService {

	public Iterable<Estudiante> findAll();
	public Optional<Estudiante> findById(Long id);
	public Boolean saveStudent(Estudiante student);
	public Boolean updateStudent(Estudiante student);
	public void deleteStudent(Estudiante student);
	
}