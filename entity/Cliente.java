package com.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 6461612263128935063L;


	@Column(name="NombreCia")
	private String nombreCia;
	
	@Id
	private String idCliente;
	
	@Column(name="NombreContacto")
	private String nombreContacto;
	
	@Column(name="CargoContacto")
	private String cargoContacto;
	
	@Column(name="Direccion")
	private String direccion;
	
	@Column(name="Ciudad")
	private String ciudad;
	
	@Column(name="Region")
	private String region;
	
	@Column(name="CodPostal")
	private String codPostal;
	
	@Column(name="Pais")
	private String pais;
	
	@Column(name="Telefono")
	private String telefono;
	
	@Column(name="Fax")
	private String Fax;

 

	public String getNombreCia() {
		return nombreCia;
	}

	public void setNombreCia(String nombreCia) {
		this.nombreCia = nombreCia;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getCargoContacto() {
		return cargoContacto;
	}

	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

}
