package co.com.ecommerce.daos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import co.com.ecommerce.entities.Departamento;
import co.com.ecommerce.utilities.Conexion;

public class DepartamentoDao {

	EntityManager entity = Conexion.getEntityManagerFactory().createEntityManager();
	
	public void crearDepartamento(Departamento departamento) {
		entity.getTransaction().begin();
		entity.persist(departamento);
		entity.getTransaction().commit();
	}

	public Departamento buscar(Integer id) {
		Departamento departamento = new Departamento();
		departamento = entity.find(Departamento.class, id);
		if (departamento.getIdPais() != 0) {
			return departamento;
		}
		return null;
	}

	public List<Departamento> buscarDepartamento(Integer id) {
		List<Departamento> departamento = new ArrayList<>();
		Query q = entity.createQuery("SELECT dpto FROM Departamento dpto WHERE id = " + id + "AND idPais = 1");
		departamento = q.getResultList();
		return departamento;
	}
	
	
	
}
