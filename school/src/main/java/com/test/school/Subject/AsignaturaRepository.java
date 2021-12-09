package com.test.school.Subject;

import org.springframework.data.repository.CrudRepository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called asignaturaRepository
//CRUD refers Create, Read, Update, Delete

public interface AsignaturaRepository extends CrudRepository<Asignatura, Long> {

}
