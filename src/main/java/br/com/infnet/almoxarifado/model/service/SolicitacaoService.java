package br.com.infnet.almoxarifado.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.almoxarifado.model.negocio.Solicitacao;
import br.com.infnet.almoxarifado.model.repository.ISolicitacaoRepository;

@Service
public class SolicitacaoService {

	@Autowired
	private ISolicitacaoRepository repository;

	public void incluir(Solicitacao solicitacao) {
		repository.save(solicitacao);
	}

	public List<Solicitacao> obterLista() {
		return (List<Solicitacao>) repository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	public Solicitacao obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
