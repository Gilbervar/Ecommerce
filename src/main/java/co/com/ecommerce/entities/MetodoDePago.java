package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "MetodoDePago" database table.
 * 
 */
@Entity
@Table(name="\"MetodoDePago\"", schema= "ecommerce")
@NamedQuery(name="MetodoDePago.findAll", query="SELECT m FROM MetodoDePago m")
public class MetodoDePago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String metodos;

	public MetodoDePago() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMetodos() {
		return this.metodos;
	}

	public void setMetodos(String metodos) {
		this.metodos = metodos;
	}

}