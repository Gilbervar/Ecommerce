package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Ciudad" database table.
 * 
 */
@Entity
@Table(name="\"Ciudad\"", schema= "ecommerce")
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ciudades;

	@Column(name="\"idDepartamento\"")
	private Integer idDepartamento;

	public Ciudad() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(String ciudades) {
		this.ciudades = ciudades;
	}

	public Integer getIdDepartamento() {
		return this.idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

}