package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Marca" database table.
 * 
 */
@Entity
@Table(name="\"Marca\"", schema= "ecommerce")
@NamedQuery(name="Marca.findAll", query="SELECT m FROM Marca m")
public class Marca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String marcas;

	public Marca() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarcas() {
		return this.marcas;
	}

	public void setMarcas(String marcas) {
		this.marcas = marcas;
	}

}