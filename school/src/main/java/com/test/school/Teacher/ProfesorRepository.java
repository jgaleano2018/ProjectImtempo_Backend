package com.test.school.Teacher;

import org.springframework.data.repository.CrudRepository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called colegioRepository
//CRUD refers Create, Read, Update, Delete

public interface ProfesorRepository extends CrudRepository<Profesor, Long> {

}
