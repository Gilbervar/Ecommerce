package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Producto" database table.
 * 
 */
@Entity
@Table(name="\"Producto\"", schema= "ecommerce")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="\"cantidadMinima\"")
	private String cantidadMinima;

	@Column(name="\"cantidadUnidades\"")
	private String cantidadUnidades;

	private String caracteristicas;

	private String descuento;

	private Integer estado;

	@Column(name="\"fechaCreacion\"")
	private String fechaCreacion;

	@Column(name="\"idAdministrador\"")
	private Integer idAdministrador;

	@Column(name="\"idCategoria\"")
	private Integer idCategoria;

	@Column(name="\"idMarca\"")
	private Integer idMarca;

	private String imagen;

	private String iva;

	private String nombre;

	@Column(name="\"unidadesVendidas\"")
	private String unidadesVendidas;

	private String valor;

	public Producto() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCantidadMinima() {
		return this.cantidadMinima;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setCantidadMinima(String cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}

	public String getCantidadUnidades() {
		return this.cantidadUnidades;
	}

	public void setCantidadUnidades(String cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}

	public String getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getDescuento() {
		return this.descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getIdAdministrador() {
		return this.idAdministrador;
	}

	public void setIdAdministrador(Integer idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Integer getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getIva() {
		return this.iva;
	}

	public void setIva(String iva) {
		this.iva = iva;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUnidadesVendidas() {
		return this.unidadesVendidas;
	}

	public void setUnidadesVendidas(String unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", cantidadMinima=" + cantidadMinima + ", cantidadUnidades=" + cantidadUnidades
				+ ", caracteristicas=" + caracteristicas + ", descuento=" + descuento + ", estado=" + estado
				+ ", fechaCreacion=" + fechaCreacion + ", idAdministrador=" + idAdministrador + ", idCategoria="
				+ idCategoria + ", idMarca=" + idMarca + ", imagen=" + imagen + ", iva=" + iva + ", nombre=" + nombre
				+ ", unidadesVendidas=" + unidadesVendidas + ", valor=" + valor + "]";
	}

}