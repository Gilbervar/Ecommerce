package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Categoria" database table.
 * 
 */
@Entity
@Table(name="\"Categoria\"", schema= "ecommerce")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String categorias;

	public Categoria() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategorias() {
		return this.categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}

}