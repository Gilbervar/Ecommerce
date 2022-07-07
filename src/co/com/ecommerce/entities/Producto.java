package co.com.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Producto" database table.
 * 
 */
@Entity
@Table(name="\"Producto\"")
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

	@Temporal(TemporalType.DATE)
	@Column(name="\"fechaCreacion\"")
	private Date fechaCreacion;

	private String imagen;

	private String iva;

	private String nombre;

	@Column(name="\"unidadesVendidas\"")
	private String unidadesVendidas;

	private String valor;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="producto")
	private List<Factura> facturas;

	//bi-directional many-to-one association to Administrador
	@ManyToOne
	@JoinColumn(name="\"idAdministrador\"")
	private Administrador administrador;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="\"idCategoria\"")
	private Categoria categoria;

	//bi-directional many-to-one association to Marca
	@ManyToOne
	@JoinColumn(name="\"idMarca\"")
	private Marca marca;

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

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setProducto(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setProducto(null);

		return factura;
	}

	public Administrador getAdministrador() {
		return this.administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}