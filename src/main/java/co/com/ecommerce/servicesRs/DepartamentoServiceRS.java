package co.com.ecommerce.servicesRs;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import co.com.ecommerce.entities.Departamento;
import co.com.ecommerce.serviceImpl.DepartamentoServiceImpl;

@Path("/departamento")
public class DepartamentoServiceRS {

	private DepartamentoServiceImpl departamentoServiceImpl;
	
	public DepartamentoServiceRS() {
		departamentoServiceImpl = new DepartamentoServiceImpl();
	}
	
	
	@POST
	@Path("/crearDepartamento")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response crearDepartamento(Departamento departamento) {
		departamentoServiceImpl.crearDepartamento(departamento);
		return Response.ok().entity(departamento).build();
	}

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/buscar/{id}")
	public Departamento buscar(@PathParam("id")Integer id) {
		Departamento departamento = departamentoServiceImpl.buscar(id);
		return departamento;
	}
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/buscarDepartamento/{id}")
	public List<Departamento> buscarDepartamento(@PathParam("id")Integer id) {
		List<Departamento> departamento = departamentoServiceImpl.buscarDepartamento(id);
		return departamento;
	}
	
	
}
