package co.com.ecommerce.services;

import java.util.List;
import co.com.ecommerce.entities.Producto;

public interface ProductoService {

	public void crearProducto(Producto producto);
	
	public Producto buscar (Integer id);
	
	public List<Producto> buscarProducto (Integer id);
	
	
}
