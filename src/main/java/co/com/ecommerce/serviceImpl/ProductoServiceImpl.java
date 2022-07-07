package co.com.ecommerce.serviceImpl;

import java.util.List;
import co.com.ecommerce.daos.ProductoDao;
import co.com.ecommerce.entities.Producto;
import co.com.ecommerce.services.ProductoService;


public class ProductoServiceImpl implements ProductoService {

	
	private ProductoDao productoDao;
	
	public ProductoServiceImpl() {
		productoDao = new ProductoDao();
	}

	@Override
	public Producto buscar(Integer id) {
		Producto producto = productoDao.buscar(id);
		return producto;
	}

	@Override
	public List<Producto> buscarProducto(Integer id) {
		List<Producto> producto = productoDao.buscarProducto(id);
		return producto;
	}

	@Override
	public void crearProducto(Producto producto) {
		productoDao.crearProducto(producto);
	}

}
