package com.kots.sidim.web.model;

// Generated 27/08/2012 21:21:46 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PendenciaCadastroImoveis generated by hbm2java
 */
@Entity
@Table(name = "PENDENCIA_CADASTRO_IMOVEIS")
@ManagedBean(name = "pendenciaCadastroImoveis")
public class PendenciaCadastroImoveis implements java.io.Serializable {

	private long idPendencia;
	private Estado estado;
	private Funcionario funcionario;
	private TipoImovel tipoImovel;
	private Cidade cidade;
	private Bairro bairro;
	private Date data;
	private String tipoPendencia;
	private byte dormitorios;
	private int area;
	private Boolean garagens;
	private Byte suites;
	private String cep;
	private String rua;
	private BigDecimal preco;
	private String descricao;
	private String aprovado;
	private String motivo;

	public PendenciaCadastroImoveis() {
	}

	public PendenciaCadastroImoveis(long idPendencia, Estado estado, Funcionario funcionario, TipoImovel tipoImovel, Cidade cidade, Bairro bairro, Date data,
			String tipoPendencia, byte dormitorios, int area, String cep, String rua, BigDecimal preco, String aprovado) {
		this.idPendencia = idPendencia;
		this.estado = estado;
		this.funcionario = funcionario;
		this.tipoImovel = tipoImovel;
		this.cidade = cidade;
		this.bairro = bairro;
		this.data = data;
		this.tipoPendencia = tipoPendencia;
		this.dormitorios = dormitorios;
		this.area = area;
		this.cep = cep;
		this.rua = rua;
		this.preco = preco;
		this.aprovado = aprovado;
	}

	public PendenciaCadastroImoveis(long idPendencia, Estado estado, Funcionario funcionario, TipoImovel tipoImovel, Cidade cidade, Bairro bairro, Date data,
			String tipoPendencia, byte dormitorios, int area, Boolean garagens, Byte suites, String cep, String rua, BigDecimal preco, String descricao,
			String aprovado, String motivo) {
		this.idPendencia = idPendencia;
		this.estado = estado;
		this.funcionario = funcionario;
		this.tipoImovel = tipoImovel;
		this.cidade = cidade;
		this.bairro = bairro;
		this.data = data;
		this.tipoPendencia = tipoPendencia;
		this.dormitorios = dormitorios;
		this.area = area;
		this.garagens = garagens;
		this.suites = suites;
		this.cep = cep;
		this.rua = rua;
		this.preco = preco;
		this.descricao = descricao;
		this.aprovado = aprovado;
		this.motivo = motivo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_PENDENCIA_CADASTRO_IMOVEIS")
	@SequenceGenerator(name="SEQ_PENDENCIA_CADASTRO_IMOVEIS", sequenceName = "SEQ_PENDENCIA_CADASTRO_IMOVEIS", allocationSize=1)
	@Column(name = "ID_PENDENCIA", unique = true, nullable = false, precision = 14, scale = 0)
	public long getIdPendencia() {
		return this.idPendencia;
	}

	public void setIdPendencia(long idPendencia) {
		this.idPendencia = idPendencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESTADO", nullable = false)
	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CPF", nullable = false)
	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIPO_IMOVEL", nullable = false)
	public TipoImovel getTipoImovel() {
		return this.tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CIDADE", nullable = false)
	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_BAIRRO", nullable = false)
	public Bairro getBairro() {
		return this.bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA", nullable = false, length = 7)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "TIPO_PENDENCIA", nullable = false, length = 2)
	public String getTipoPendencia() {
		return this.tipoPendencia;
	}

	public void setTipoPendencia(String tipoPendencia) {
		this.tipoPendencia = tipoPendencia;
	}

	@Column(name = "DORMITORIOS", nullable = false, precision = 2, scale = 0)
	public byte getDormitorios() {
		return this.dormitorios;
	}

	public void setDormitorios(byte dormitorios) {
		this.dormitorios = dormitorios;
	}

	@Column(name = "AREA", nullable = false, precision = 6, scale = 0)
	public int getArea() {
		return this.area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Column(name = "GARAGENS", precision = 1, scale = 0)
	public Boolean getGaragens() {
		return this.garagens;
	}

	public void setGaragens(Boolean garagens) {
		this.garagens = garagens;
	}

	@Column(name = "SUITES", precision = 2, scale = 0)
	public Byte getSuites() {
		return this.suites;
	}

	public void setSuites(Byte suites) {
		this.suites = suites;
	}

	@Column(name = "CEP", nullable = false, length = 10)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(name = "RUA", nullable = false, length = 50)
	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	@Column(name = "PRECO", nullable = false, precision = 10)
	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Column(name = "DESCRICAO", length = 3000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "APROVADO", nullable = false, length = 1)
	public String getAprovado() {
		return this.aprovado;
	}

	public void setAprovado(String aprovado) {
		this.aprovado = aprovado;
	}

	@Column(name = "MOTIVO", length = 3000)
	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}