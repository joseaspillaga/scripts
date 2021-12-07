package com.springboot.app.models.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="proveedores")
public class Proveedor implements Serializable{

	private static final long serialVersionUID = 5741530042738768044L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProveedor;
	
	@NotEmpty(message = " No puede estar vacío ")
	@Size(min = 4, max = 40, message = " el valor debe estar entre 4 y 40 caracteres ")
	@Column(name="NombreCia")
	private String nombreCia;
	private String nombrecontacto;
	private String cargocontacto;
	private String direccion;
	private String ciudad;
	private String region;
	private String codPostal;
	private String pais;
	private String telefono;
	private String fax;
	
	public Long getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombreCia() {
		return nombreCia;
	}
	public void setNombreCia(String nombreCia) {
		this.nombreCia = nombreCia;
	}
	public String getNombrecontacto() {
		return nombrecontacto;
	}
	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}
	public String getCargocontacto() {
		return cargocontacto;
	}
	public void setCargocontacto(String cargocontacto) {
		this.cargocontacto = cargocontacto;
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
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
 
}
