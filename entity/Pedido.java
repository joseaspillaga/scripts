package com.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido implements Serializable{

	private static final long serialVersionUID = -8746836631203962036L;

	@Id
	@Column(name="IdPedido")
	private Long idPedido;
	
	@ManyToOne()
	@JoinColumn(name="IdCliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="IdEmpleado")
	private Empleado empleado;
	
 	@Column(name="FechaPedido")
	private java.util.Date fechaPedido;
	
	@Column(name="FechaEntrega")
	private java.util.Date fechaEntrega;
	
	@Column(name="FechaEnvio")
	private java.util.Date fechaEnvio;
	
	 @ManyToOne
	 @JoinColumn(name = "idCia")
	private CiaEnvios ciaEnvio;
	
	@Column(name="Cargo")
	private double cargo;
	
	@Column(name="Destinatario")
	private String destinatario;
	
	@Column(name="DireccionDestinatario")
	private String direccionDestinatario;
	
	@Column(name="CiudadDestinatario")
	private String ciudadDestinatario;
	
	@Column(name="RegionDestinatario")
	private String regionDestinatario;
	
	@Column(name="CodPostalDestinatario")
	private String codPostalDestinatario;
	
	@Column(name="PaisDestinatario")
	private String paisDestinatario;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public java.util.Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(java.util.Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public java.util.Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(java.util.Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public java.util.Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(java.util.Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	 

	public double getCargo() {
		return cargo;
	}

	public void setCargo(double cargo) {
		this.cargo = cargo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}

	public String getCiudadDestinatario() {
		return ciudadDestinatario;
	}

	public void setCiudadDestinatario(String ciudadDestinatario) {
		this.ciudadDestinatario = ciudadDestinatario;
	}

	public String getRegionDestinatario() {
		return regionDestinatario;
	}

	public void setRegionDestinatario(String regionDestinatario) {
		this.regionDestinatario = regionDestinatario;
	}

	public String getCodPostalDestinatario() {
		return codPostalDestinatario;
	}

	public void setCodPostalDestinatario(String codPostalDestinatario) {
		this.codPostalDestinatario = codPostalDestinatario;
	}

	public String getPaisDestinatario() {
		return paisDestinatario;
	}

	public void setPaisDestinatario(String paisDestinatario) {
		this.paisDestinatario = paisDestinatario;
	}

	public CiaEnvios getCiaEnvio() {
		return ciaEnvio;
	}

	public void setCiaEnvio(CiaEnvios ciaEnvio) {
		this.ciaEnvio = ciaEnvio;
	}

	 
	 
	
}
