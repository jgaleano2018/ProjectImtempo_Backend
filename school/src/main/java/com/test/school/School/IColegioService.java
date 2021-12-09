package com.test.school.School;

import java.util.Optional;

public interface IColegioService {

	public Iterable<Colegio> findAll();
	public Optional<Colegio> findById(Long id);
	public Boolean saveSchool(Colegio school);
	public Boolean updateSchool(Colegio school);
	public void deleteSchool(Colegio school);
	
}
