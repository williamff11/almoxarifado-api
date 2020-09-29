package br.com.infnet.almoxarifado.model.negocio;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "TSolicitacao")
public class Solicitacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ApiModelProperty(value = "Data do Pedido")
	private LocalDate data;
	@ApiModelProperty(value = "Lista dos produtos que estarão nos pedidos")
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name = "TSolicitacaoProduto", joinColumns = {
			@JoinColumn(name = "idSolicitacao") }, inverseJoinColumns = { @JoinColumn(name = "idProduto") })
	private List<Produto> produtos;
	@OneToOne(cascade = CascadeType.DETACH)
	@ApiModelProperty(value = "Identificador do Solicitante (user)")
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	@Override
	public String toString() {
		return "Solicitacao [id=" + id + ", quantidade=" + ", produtos=" + produtos + ", usuario=" + usuario + "]";
	}

	public Solicitacao() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
