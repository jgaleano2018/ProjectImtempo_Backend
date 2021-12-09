package com.test.school.Course;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.test.school.Subject.Asignatura;

@Entity // Mediante esta clase se crea la tabla: Cursos con la funcionalidad de Hibernate (Automático)

public class Cursos {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer idColegio;
	private Integer grado;
	private String salon;
	private List<Asignatura> asignaturas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(Integer idColegio) {
		this.idColegio = idColegio;
	}

	public Integer getGrado() {
		return grado;
	}

	public void setGrado(Integer grado) {
		this.grado = grado;
	}
	
	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public Cursos() {
		
	}
	
    //getters and setters
	public String toString(){
	  return this.grado+":"+this.salon;
	}
	
}
