package br.com.infnet.almoxarifado.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TPapelaria")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Papelaria extends Produto {

	private String cor;
	private boolean reutilizavel;
	
	@Override
	public String toString() {
		return "Papelaria [cor=" + cor + ", reutilizavel=" + reutilizavel + "]";
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isReutilizavel() {
		return reutilizavel;
	}
	public void setReutilizavel(boolean reutilizavel) {
		this.reutilizavel = reutilizavel;
	}
}
