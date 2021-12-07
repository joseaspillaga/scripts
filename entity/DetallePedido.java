package com.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="detallesdepedidos")
@IdClass(DetallePedidoId.class)
public class DetallePedido implements Serializable {
	
	private static final long serialVersionUID = 8486012523319096490L;
	
	@Id
	private Long idpedido;
	@Id
	private Long idproducto;
	private Double preciounidad;
	private int cantidad;
	private Double descuento;
	
	public Long getIdpedido() {
		return idpedido;
	}
	public void setIdpedido(Long idpedido) {
		this.idpedido = idpedido;
	}
	public Long getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Long idproducto) {
		this.idproducto = idproducto;
	}
	public Double getPreciounidad() {
		return preciounidad;
	}
	public void setPreciounidad(Double preciounidad) {
		this.preciounidad = preciounidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	
}
