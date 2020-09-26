package br.com.infnet.almoxarifado.model.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "TUsuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String login;
	private String senha;
	@ApiModelProperty(value = "O usuário é gestor?")
	private boolean gestor;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idSetor")
	private Setor setor;
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login + ", gestor=" + gestor + ", setor=" + setor
				+ "]";
	}

	public Usuario() {
		super();
	}

	public Usuario(Integer id) {
		super();
		this.id = id;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isGestor() {
		return gestor;
	}
	public void setGestor(boolean gestor) {
		this.gestor = gestor;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
}
