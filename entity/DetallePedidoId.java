package com.springboot.app.models.entity;


import java.io.Serializable;
import java.util.Objects;

public class DetallePedidoId implements Serializable{

	private static final long serialVersionUID = 95471427310653256L;
	private Long idpedido;
	private Long idproducto;
	
	public DetallePedidoId(Long idpedido, Long idproducto) {
		this.idpedido = idpedido;
		this.idproducto = idproducto;
	}

	public DetallePedidoId() {
	}
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        DetallePedidoId detallePedidoId = (DetallePedidoId) o;
	        return idpedido.equals(detallePedidoId.idpedido) &&
	        		idproducto.equals(detallePedidoId.idproducto);
	    }
	 
	 @Override
	    public int hashCode() {
	        return Objects.hash(idpedido, idproducto);
	    }
}
