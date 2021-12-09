package com.test.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.school.Course.Cursos;
import com.test.school.School.Colegio;
import com.test.school.School.ColegioRepository;
import com.test.school.Student.Estudiante;
import com.test.school.Subject.Asignatura;
import com.test.school.Teacher.Profesor;

@SpringBootApplication
public class SchoolApplication {

	 @Autowired
	  ColegioRepository colegioRepo;
	 
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	 public void run(String... arg0) throws Exception {
	    System.out.println("Inserting school records:");
	    
	    Colegio colegio = new Colegio();
	    colegio.setNombre("El colegio del Olimpo");
	    
	    System.out.println("Inserting courses records:");
	    Cursos cursos = new Cursos();
	    
	    cursos.setGrado(10);
	    cursos.setSalon("A");
	    
	    cursos = new Cursos();
	    cursos.setGrado(10);
	    cursos.setSalon("B");
	    
	    cursos = new Cursos();
	    cursos.setGrado(11);
	    cursos.setSalon("A");
	    
	    cursos = new Cursos();
	    cursos.setGrado(11);
	    cursos.setSalon("B");
	    
	    
	    System.out.println("Inserting teachers records:");
	    Profesor profesor = new Profesor();
	    Asignatura asignatura = new Asignatura();
	    
	    profesor.setNombre("Némesis");
	    asignatura.setNombre("Matemáticas");
	    asignatura.setProfesor(profesor);
	    
	    asignatura = new Asignatura();
	    asignatura.setNombre("Pre Icfes");
	    asignatura.setProfesor(profesor);
	    
	    
	    profesor = new Profesor();
	    profesor.setNombre("Príapo");
	    
	    asignatura = new Asignatura();
	    asignatura.setNombre("Español");
	    asignatura.setProfesor(profesor);
	    
	    profesor = new Profesor();
	    profesor.setNombre("Iris");
	    
	    asignatura = new Asignatura();
	    asignatura.setNombre("Ingles básico");
	    asignatura.setProfesor(profesor);

	    asignatura = new Asignatura();
	    asignatura.setNombre("Ingles avanzado");
	    asignatura.setProfesor(profesor);

	    
	    System.out.println("Inserting students records:");
	    Estudiante estudiante = new Estudiante();
	    
	    estudiante.setNombre("Afrodita");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Apolo");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Ares");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Artemisa");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Atenea");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Dionisio");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Hefesto");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Hera");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Hermes");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Hades");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Poseidón");
	    estudiante = new Estudiante();
	    estudiante.setNombre("Zeús");

	    Iterable<Colegio> colegioList = colegioRepo.findAll();
	    colegioList.forEach(school -> System.out.println(school.toString()));
	    
	    
	 }
}
