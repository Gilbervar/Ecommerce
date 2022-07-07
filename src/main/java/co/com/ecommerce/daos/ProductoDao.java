package co.com.ecommerce.daos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import co.com.ecommerce.entities.Producto;
import co.com.ecommerce.utilities.Conexion;

public class ProductoDao {

	EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();

	
	public void crearProducto(Producto producto) {
		entity.getTransaction().begin();
		entity.persist(producto);
		entity.getTransaction().commit();
	}
	
	public Producto buscar(Integer id) {
		Producto producto = new Producto();
		producto = entity.find(Producto.class, id);
		if (producto.getEstado() != 0) {
			return producto;
		}
		return null;
	}

	public List<Producto> buscarProducto(Integer id) {
		List<Producto> producto = new ArrayList<>();
		Query q = entity.createQuery("SELECT pr FROM Producto pr WHERE id = " + id + "AND estado = 1");
		producto = q.getResultList();
		return producto;
	}

}
