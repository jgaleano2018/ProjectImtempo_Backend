package com.test.school.Teacher;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.test.school.Subject.Asignatura;

@Entity // Mediante esta clase se crea la tabla: Profesor con la funcionalidad de Hibernate (Automático)

public class Profesor {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String nombre;
	private List<Asignatura> asignaturas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public Profesor() {
		
	}
	
    //getters and setters
	public String toString(){
	  return this.nombre;
	}
}
