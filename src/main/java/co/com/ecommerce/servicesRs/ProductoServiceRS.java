
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
import co.com.ecommerce.entities.Producto;
import co.com.ecommerce.serviceImpl.ProductoServiceImpl;

@Path("/producto")
public class ProductoServiceRS {

	private ProductoServiceImpl productoServiceImpl;
	
	public ProductoServiceRS() {
		productoServiceImpl = new ProductoServiceImpl();
	}
	
	@POST
	@Path("/crearProducto")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response crearProducto(Producto producto) {
		productoServiceImpl.crearProducto(producto);
		return Response.ok().entity(producto).build();
	}
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/buscar/{id}")
	public Producto buscar(@PathParam("id")Integer id) {
		Producto producto = productoServiceImpl.buscar(id);
		return producto;
	}
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/buscarProducto/{id}")
	public List<Producto> buscarProducto(@PathParam("id")Integer id) {
		List<Producto> producto = productoServiceImpl.buscarProducto(id);
		return producto;
	}
	
}
