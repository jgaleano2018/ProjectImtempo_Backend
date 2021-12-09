package com.test.school.Teacher;

import java.util.Optional;

public interface IProfesorService {

	public Iterable<Profesor> findAll();
	public Optional<Profesor> findById(Long id);
	public Boolean saveTeacher(Profesor teacher);
	public Boolean updateTeacher(Profesor teacher);
	public void deleteTeacher(Profesor teacher);
	
}