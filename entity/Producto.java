package com.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = -7540228417982890746L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproducto")
	private Long idProducto;
	private String nombreProducto;

	private String cantidadPorUnidad;
	private double precioUnidad;

	private int unidadesEnExistencia;
	private int unidadesEnPedido;
	private int nivelNuevoPedido;
	private int suspendido;
 

	@ManyToOne
	@JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
	public Categoria categoria;

	@ManyToOne
	@JoinColumn(name = "idProveedor")
	public Proveedor proveedor;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCantidadPorUnidad() {
		return cantidadPorUnidad;
	}

	public void setCantidadPorUnidad(String cantidadPorUnidad) {
		this.cantidadPorUnidad = cantidadPorUnidad;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getUnidadesEnExistencia() {
		return unidadesEnExistencia;
	}

	public void setUnidadesEnExistencia(int unidadesEnExistencia) {
		this.unidadesEnExistencia = unidadesEnExistencia;
	}

	public int getUnidadesEnPedido() {
		return unidadesEnPedido;
	}

	public void setUnidadesEnPedido(int unidadesEnPedido) {
		this.unidadesEnPedido = unidadesEnPedido;
	}

	public int getNivelNuevoPedido() {
		return nivelNuevoPedido;
	}

	public void setNivelNuevoPedido(int nivelNuevoPedido) {
		this.nivelNuevoPedido = nivelNuevoPedido;
	}

	public int getSuspendido() {
		return suspendido;
	}

	public void setSuspendido(int suspendido) {
		this.suspendido = suspendido;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}
