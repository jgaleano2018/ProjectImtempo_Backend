package com.test.school.Teacher;


public class ProfesorJoin {

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
	
	public ProfesorJoin(String nombreAsignatura, String nombreEstudiante) {
		this.nombreAsignatura = nombreAsignatura;
		this.nombreEstudiante = nombreEstudiante;
	}

	public ProfesorJoin() {
	}
}
