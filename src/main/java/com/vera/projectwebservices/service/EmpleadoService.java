/**
 * 
 */
package com.vera.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.vera.projectwebservices.entity.Empleado;

/**
 * @author usuario
 *
 */
public class EmpleadoService {
	
	public Empleado consultarEmpleadoPorNumeroEmpleado(String numeroEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();
		
		return empleadosConsultados.stream().filter(empleado-> empleado.getNumeroEmpleado().equals(numeroEmpleado)).findFirst().orElse(null);
	}

	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123");
		empleado.setNombre("Diego");
		empleado.setPrimerApellido("Paniagua");
		empleado.setSegundoApellido("López");
		empleado.setFechaCreación(LocalDateTime.now());
		empleado.setEdad(31);
		
		return empleado;
	}
	
	
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList();
		
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123");
		empleado.setNombre("Diego");
		empleado.setPrimerApellido("Paniagua");
		empleado.setSegundoApellido("López");
		empleado.setFechaCreación(LocalDateTime.now());
		empleado.setEdad(31);
		
		empleados.add(empleado);

		empleado = new Empleado();
		empleado.setNumeroEmpleado("456");
		empleado.setNombre("Juan");
		empleado.setPrimerApellido("Camarena");
		empleado.setSegundoApellido("Garcia");
		empleado.setFechaCreación(LocalDateTime.now());
		empleado.setEdad(31);
		
		empleados.add(empleado);
		
		return empleados;
		
	}
	


}
