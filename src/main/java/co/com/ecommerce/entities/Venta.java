package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ventas database table.
 * 
 */
@Entity
@Table(name="ventas", schema= "ecommerce")
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

	@Column(name="\"idCiudad\"")
	private Integer idCiudad;

	@Column(name="\"idMetodoPago\"")
	private Integer idMetodoPago;

	@Column(name="\"idUsuario\"")
	private Integer idUsuario;

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

	public Integer getIdCiudad() {
		return this.idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	public Integer getIdMetodoPago() {
		return this.idMetodoPago;
	}

	public void setIdMetodoPago(Integer idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


	
	
}