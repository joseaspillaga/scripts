package com.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="empleados")
public class Empleado implements Serializable{

	private static final long serialVersionUID = 5697677592940205900L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdEmpleado")
	private Long idEmpleado;
	
	@Column(name="Apellidos")
	private String apellidos;
	
	@Column(name="Nombre")
	private String nombre;
	
	
	private String cargo;
	
	@Column(name="Tratamiento")
	private String tratamiento;
	
	@Column(name="FechaNacimiento")
	private java.util.Date fechaNacimiento;
	
	@Column(name="FechaContratacion")
	private java.util.Date fechaContratacion;
	
	private String direccion;
	private String ciudad;
	private String region;
	private String codPostal;
	private String pais;
	
	@Column(name="TelDomicilio")
	private String telDomicilio;
	
	@Column(name="Extension")
	private String extension;
	
	private String notas;
	
	@Column(name="Jefe")
	private Long jefe;
	
	
	private Double sueldoBasico;

	private int estado;

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public java.util.Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(java.util.Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public java.util.Date getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(java.util.Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
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

	public String getTelDomicilio() {
		return telDomicilio;
	}

	public void setTelDomicilio(String telDomicilio) {
		this.telDomicilio = telDomicilio;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public Long getJefe() {
		return jefe;
	}

	public void setJefe(Long jefe) {
		this.jefe = jefe;
	}

	public Double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
}
