package com.kots.sidim.web.model;

// Generated 27/08/2012 21:21:46 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InteresseCliente generated by hbm2java
 */
@Entity
@Table(name = "INTERESSE_CLIENTE")
@ManagedBean(name = "interesseCliente")
public class InteresseCliente implements java.io.Serializable {

	private InteresseClienteId id;
	private Imovel imovel;
	private Cliente cliente;
	private Date data;

	public InteresseCliente() {
	}

	public InteresseCliente(InteresseClienteId id, Imovel imovel, Cliente cliente, Date data) {
		this.id = id;
		this.imovel = imovel;
		this.cliente = cliente;
		this.data = data;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "login", column = @Column(name = "LOGIN", nullable = false, length = 15)),
			@AttributeOverride(name = "idImovel", column = @Column(name = "ID_IMOVEL", nullable = false, precision = 8, scale = 0)) })
	public InteresseClienteId getId() {
		return this.id;
	}

	public void setId(InteresseClienteId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_IMOVEL", nullable = false, insertable = false, updatable = false)
	public Imovel getImovel() {
		return this.imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOGIN", nullable = false, insertable = false, updatable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA", nullable = false, length = 7)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
