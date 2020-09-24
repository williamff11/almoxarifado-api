package br.com.infnet.almoxarifado.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TManutencao")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Manutencao extends Produto {

	private String utilidade;
	private boolean toxico;
	
	@Override
	public String toString() {
		return "Manutencao [utilidade=" + utilidade + ", toxico=" + toxico + "]";
	}
	
	public String getUtilidade() {
		return utilidade;
	}
	public void setUtilidade(String utilidade) {
		this.utilidade = utilidade;
	}
	public boolean isToxico() {
		return toxico;
	}
	public void setToxico(boolean toxico) {
		this.toxico = toxico;
	}
}
