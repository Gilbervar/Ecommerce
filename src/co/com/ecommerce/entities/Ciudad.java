package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "Ciudad" database table.
 * 
 */
@Entity
@Table(name="\"Ciudad\"")
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String ciudades;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="\"idDepartamento\"")
	private Departamento departamento;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="ciudad")
	private List<Venta> ventas;

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

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Venta addVenta(Venta venta) {
		getVentas().add(venta);
		venta.setCiudad(this);

		return venta;
	}

	public Venta removeVenta(Venta venta) {
		getVentas().remove(venta);
		venta.setCiudad(null);

		return venta;
	}

}