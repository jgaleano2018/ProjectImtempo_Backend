package com.test.school.Subject;

import java.util.Optional;

public interface IAsignaturaService {

	public Iterable<Asignatura> findAll();
	public Iterable<AsignaturaEstudiante> findAEAll();
	public Optional<Asignatura> findById(Long id);
	public Boolean saveSubject(Asignatura asignatura);
	public Boolean updateSubject(Asignatura asignatura);
	public void deleteSubject(Asignatura asignatura);
	
}
