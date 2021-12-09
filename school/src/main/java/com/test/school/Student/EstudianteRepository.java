package com.test.school.Student;

import org.springframework.data.repository.CrudRepository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called estudianteRepository
//CRUD refers Create, Read, Update, Delete

public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {

}
