package br.com.infnet.almoxarifado.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.almoxarifado.model.negocio.Produto;
import br.com.infnet.almoxarifado.model.repository.IProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private IProdutoRepository repository;

	public void incluir(Produto produto) {
		repository.save(produto);
	}

	public List<Produto> obterLista() {
		return (List<Produto>) repository.findAll(Sort.by(Sort.Direction.ASC, "descricao"));
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public Produto obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
