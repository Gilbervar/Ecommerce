package co.com.ecommerce.serviceImpl;

import java.util.List;
import co.com.ecommerce.daos.DepartamentoDao;
import co.com.ecommerce.entities.Departamento;
import co.com.ecommerce.services.DepartamentoService;

public class DepartamentoServiceImpl implements DepartamentoService {

	private DepartamentoDao departamentoDao;
	
	public DepartamentoServiceImpl() {
		departamentoDao = new DepartamentoDao();
	}
	
	@Override
	public void crearDepartamento(Departamento departamento) {
		departamentoDao.crearDepartamento(departamento);
	}


	@Override
	public Departamento buscar(Integer id) {
		Departamento departamento = departamentoDao.buscar(id);
		return departamento;
	}


	@Override
	public List<Departamento> buscarDepartamento(Integer id) {
		List<Departamento> departamento = departamentoDao.buscarDepartamento(id);
		return departamento;
	}

	

	
}
