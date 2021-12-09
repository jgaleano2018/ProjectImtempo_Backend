package com.test.school.Course;

import java.util.Optional;

public interface ICursosService {

	public Iterable<Cursos> findAll();
	public Optional<Cursos> findById(Long id);
	public Boolean saveCourses(Cursos course);
	public Boolean updateCourses(Cursos course);
	public void deleteCourses(Cursos course);
	
}
