package com.test.school.Teacher;

import javax.persistence.Entity;

@Entity // Mediante esta clase se crea la tabla: Profesor con la funcionalidad de Hibernate (Automático)

public class AsignaturaEstudiante {

	private String nombreAsignatura;
	private String nombreEstudiante;
	
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

}
