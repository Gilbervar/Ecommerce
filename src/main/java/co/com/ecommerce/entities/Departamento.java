package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Departamento" database table.
 * 
 */
@Entity
@Table(name="\"Departamento\"", schema= "ecommerce")
@NamedQuery(name="Departamento.findAll", query="SELECT d FROM Departamento d")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String departamentos;

	@Column(name="\"idPais\"")
	private Integer idPais;

	public Departamento() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(String departamentos) {
		this.departamentos = departamentos;
	}

	public Integer getIdPais() {
		return this.idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", departamentos=" + departamentos + ", idPais=" + idPais + "]";
	}

	
}