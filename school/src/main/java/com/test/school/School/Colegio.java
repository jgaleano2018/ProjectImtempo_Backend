package com.test.school.School;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.test.school.Course.Cursos;

@Entity // Mediante esta clase se crea la tabla: Colegio con la funcionalidad de Hibernate (Automático)
public class Colegio {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String nombre;
	private List<Cursos> cursos;

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

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void setCursos(List<Cursos> cursos) {
		this.cursos = cursos;
	}
	
	public Colegio() {
		
	}
	
    //getters and setters
	public String toString(){
	  return this.nombre;
	}
}
