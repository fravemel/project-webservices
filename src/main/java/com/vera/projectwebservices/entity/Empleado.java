/**
 * 
 */
package com.vera.projectwebservices.entity;

import java.time.LocalDateTime;

/**
 * @author usuario
 *
 */
public class Empleado {
	private String numeroEmpleado;
	
	private String nombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private int edad;
	
	private LocalDateTime fechaCreación;

	/**
	 * @return the numeroEmpleado
	 */
	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	/**
	 * @param numeroEmpleado the numeroEmpleado to set
	 */
	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the fechaCreación
	 */
	public LocalDateTime getFechaCreación() {
		return fechaCreación;
	}

	/**
	 * @param fechaCreación the fechaCreación to set
	 */
	public void setFechaCreación(LocalDateTime fechaCreación) {
		this.fechaCreación = fechaCreación;
	}
	

}
