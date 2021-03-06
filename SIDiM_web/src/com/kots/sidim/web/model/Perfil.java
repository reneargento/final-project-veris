package com.kots.sidim.web.model;

// Generated 27/08/2012 21:21:46 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Perfil generated by hbm2java
 */
@Entity
@Table(name = "PERFIL")
@ManagedBean(name = "perfil")
public class Perfil implements java.io.Serializable {

	private int idPerfil;
	private Estado estado;
	private Cidade cidade;
	private Cliente cliente;
	private Short dormitorios;
	private Integer area;
	private Byte garagens;
	private Short suites;
	private String rua;
	private BigDecimal valorMinimo;
	private BigDecimal valorMaximo;
	private String intencao;
	private Set<Bairro> bairros = new HashSet<Bairro>(0);
	private Set<TipoImovel> tipoImovels = new HashSet<TipoImovel>(0);

	public Perfil() {
	}

	public Perfil(int idPerfil, Cliente cliente) {
		this.idPerfil = idPerfil;
		this.cliente = cliente;
	}

	public Perfil(int idPerfil, Estado estado, Cidade cidade, Cliente cliente, Short dormitorios, Integer area, Byte garagens, Short suites, String rua,
			BigDecimal valorMinimo, BigDecimal valorMaximo, String intencao, Set<Bairro> bairros, Set<TipoImovel> tipoImovels) {
		this.idPerfil = idPerfil;
		this.estado = estado;
		this.cidade = cidade;
		this.cliente = cliente;
		this.dormitorios = dormitorios;
		this.area = area;
		this.garagens = garagens;
		this.suites = suites;
		this.rua = rua;
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		this.intencao = intencao;
		this.bairros = bairros;
		this.tipoImovels = tipoImovels;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_PERFIL")
	@SequenceGenerator(name="SEQ_PERFIL", sequenceName = "SEQ_PERFIL", allocationSize=1)
	@Column(name = "ID_PERFIL", unique = true, nullable = false, precision = 8, scale = 0)
	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESTADO")
	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CIDADE")
	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOGIN", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "DORMITORIOS", precision = 3, scale = 0)
	public Short getDormitorios() {
		return this.dormitorios;
	}

	public void setDormitorios(Short dormitorios) {
		this.dormitorios = dormitorios;
	}

	@Column(name = "AREA", precision = 8, scale = 0)
	public Integer getArea() {
		return this.area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	@Column(name = "GARAGENS", precision = 2, scale = 0)
	public Byte getGaragens() {
		return this.garagens;
	}

	public void setGaragens(Byte garagens) {
		this.garagens = garagens;
	}

	@Column(name = "SUITES", precision = 3, scale = 0)
	public Short getSuites() {
		return this.suites;
	}

	public void setSuites(Short suites) {
		this.suites = suites;
	}

	@Column(name = "RUA", length = 50)
	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	@Column(name = "VALOR_MINIMO", precision = 12)
	public BigDecimal getValorMinimo() {
		return this.valorMinimo;
	}

	public void setValorMinimo(BigDecimal valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	@Column(name = "VALOR_MAXIMO", precision = 12)
	public BigDecimal getValorMaximo() {
		return this.valorMaximo;
	}

	public void setValorMaximo(BigDecimal valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	@Column(name = "INTENCAO", length = 1)
	public String getIntencao() {
		return this.intencao;
	}

	public void setIntencao(String intencao) {
		this.intencao = intencao;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "PERFIL_BAIRRO", joinColumns = { @JoinColumn(name = "ID_PERFIL", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ID_BAIRRO", nullable = false, updatable = false) })
	public Set<Bairro> getBairros() {
		return this.bairros;
	}

	public void setBairros(Set<Bairro> bairros) {
		this.bairros = bairros;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "PERFIL_TIPO_IMOVEL", joinColumns = { @JoinColumn(name = "ID_PERFIL", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ID_TIPO_IMOVEL", nullable = false, updatable = false) })
	public Set<TipoImovel> getTipoImovels() {
		return this.tipoImovels;
	}

	public void setTipoImovels(Set<TipoImovel> tipoImovels) {
		this.tipoImovels = tipoImovels;
	}

}
