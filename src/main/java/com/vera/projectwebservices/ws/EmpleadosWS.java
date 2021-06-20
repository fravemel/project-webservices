/**
 * 
 */
package com.vera.projectwebservices.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vera.projectwebservices.entity.Empleado;
import com.vera.projectwebservices.service.EmpleadoService;

/**
 * @author vera
 * 
 * webservice generado con jersey
 *
 */

@Path("empleadosWS")
public class EmpleadosWS {
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	@Path("test")
	@GET
	public String test() {
		return "Probando web service con Jersey";
		
	}
	
	@GET
	@Path("consultarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Empleado consultarEmpleado() {
		return this.empleadoService.consultarEmpleado();
	}

	@GET
	@Path("consultarEmpleados")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Empleado> consultarEmpleados(){
		return this.empleadoService.consultarEmpleados();
	}

	@GET
	@Path("consultarEmpleadoPorNumeroEmpleado/{numEmp}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consultarEmpleadoPorNumeroEmpleado(@PathParam("numEmp") String numeroEmpleado) {
		
		Empleado empleado = this.empleadoService.consultarEmpleadoPorNumeroEmpleado(numeroEmpleado);
		
		if (empleado == null) {
			GenericEntity<String> entity = new GenericEntity<String>(numeroEmpleado,numeroEmpleado.getClass());
			return Response.status(204).entity("No se encontro el Empleado").build();
		}
		
		else  {
			GenericEntity<Empleado> empleandoGeneric = new GenericEntity<Empleado>(empleado, Empleado.class);
			return Response.ok(empleandoGeneric).build();
		}	
	}
	
	@POST
	@Path("guardarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response guardarEmpleado(Empleado empleado) {
		
		if (empleado == null) {
			return Response.status(400).entity("No se encontro el Empleado").build();			
		}

		GenericEntity<Empleado> empleandoGeneric = new GenericEntity<Empleado>(empleado, Empleado.class);
		return Response.ok(empleandoGeneric).build();
	}
	
	
}
