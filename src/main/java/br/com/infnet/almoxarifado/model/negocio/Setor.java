package br.com.infnet.almoxarifado.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "TSetor")
public class Setor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ApiModelProperty(value = "Nome do Setor")
	private String nome;
	@ApiModelProperty(value = "Descrição do setor")
	private String descricao;

	public Setor() {
	}

	public Setor(Integer id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Setor [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}