package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ventas database table.
 * 
 */
@Entity
@Table(name="ventas")
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="\"correoEnvio\"")
	private String correoEnvio;

	@Column(name="\"direccionEnvio\"")
	private String direccionEnvio;

	@Column(name="\"estadoVenta\"")
	private Integer estadoVenta;

	@Temporal(TemporalType.DATE)
	@Column(name="\"fechaVenta\"")
	private Date fechaVenta;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="venta")
	private List<Factura> facturas;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="\"idCiudad\"")
	private Ciudad ciudad;

	//bi-directional many-to-one association to MetodoDePago
	@ManyToOne
	@JoinColumn(name="\"idMetodoPago\"")
	private MetodoDePago metodoDePago;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="\"idUsuario\"")
	private Usuario usuario;

	public Venta() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorreoEnvio() {
		return this.correoEnvio;
	}

	public void setCorreoEnvio(String correoEnvio) {
		this.correoEnvio = correoEnvio;
	}

	public String getDireccionEnvio() {
		return this.direccionEnvio;
	}

	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}

	public Integer getEstadoVenta() {
		return this.estadoVenta;
	}

	public void setEstadoVenta(Integer estadoVenta) {
		this.estadoVenta = estadoVenta;
	}

	public Date getFechaVenta() {
		return this.fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setVenta(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setVenta(null);

		return factura;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public MetodoDePago getMetodoDePago() {
		return this.metodoDePago;
	}

	public void setMetodoDePago(MetodoDePago metodoDePago) {
		this.metodoDePago = metodoDePago;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}