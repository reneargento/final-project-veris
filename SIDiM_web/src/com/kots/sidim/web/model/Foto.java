package com.kots.sidim.web.model;

// Generated 13/09/2012 19:59:14 by Hibernate Tools 3.4.0.CR1

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Foto generated by hbm2java
 */
@Entity
@Table(name = "FOTO")
@ManagedBean(name = "foto")
public class Foto implements java.io.Serializable {

	private int idFoto;
	private Imovel imovel;
	private String url;
	

	public Foto() {
	}

	public Foto(int idFoto) {
		this.idFoto = idFoto;
	}

	public Foto(int idFoto, Imovel imovel, String url) {
		this.idFoto = idFoto;
		this.imovel = imovel;
		this.url = url;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_FOTO")
	@SequenceGenerator(name="SEQ_FOTO", sequenceName = "SEQ_FOTO", allocationSize=1)
	@Column(name = "ID_FOTO", unique = true, nullable = false, precision = 8, scale = 0)
	public int getIdFoto() {
		return this.idFoto;
	}

	public void setIdFoto(int idFoto) {
		this.idFoto = idFoto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_IMOVEL")
	public Imovel getImovel() {
		return this.imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	@Column(name = "URL", length = 200)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFoto;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Imovel))
			return false;
		Foto other = (Foto) obj;
		if (idFoto != other.idFoto)
			return false;
		return true;
	}


}
