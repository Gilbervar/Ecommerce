package co.com.ecommerce.services;

import java.util.List;

import co.com.ecommerce.entities.Departamento;

public interface DepartamentoService {
	
	
	public void crearDepartamento(Departamento departamento);
	
	public Departamento buscar(Integer id);
	
	public List<Departamento> buscarDepartamento(Integer id);

}
