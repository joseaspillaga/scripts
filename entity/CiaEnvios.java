package com.springboot.app.models.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciadeenvios")
public class CiaEnvios implements Serializable{

		private static final long serialVersionUID = 6140509380474515397L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="idCiaEnvio")
		private Long idCia;
		
		@Column(name="NombreCia")
		private String nombreCia;
		
		@Column(name="telefono")
		private String telefonoCia;
	
		private int estado;

		public Long getIdCia() {
			return idCia;
		}

		public void setIdCia(Long idCia) {
			this.idCia = idCia;
		}

		public String getNombreCia() {
			return nombreCia;
		}

		public void setNombreCia(String nombreCia) {
			this.nombreCia = nombreCia;
		}

		public String getTelefonoCia() {
			return telefonoCia;
		}

		public void setTelefonoCia(String telefonoCia) {
			this.telefonoCia = telefonoCia;
		}

		public int getEstado() {
			return estado;
		}

		public void setEstado(int estado) {
			this.estado = estado;
		}
		
	 

}
