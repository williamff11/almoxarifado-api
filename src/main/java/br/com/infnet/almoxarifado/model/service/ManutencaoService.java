package br.com.infnet.almoxarifado.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.almoxarifado.model.negocio.Manutencao;
import br.com.infnet.almoxarifado.model.repository.IManutencaoRepository;

@Service
public class ManutencaoService {

	@Autowired
	private IManutencaoRepository repository;

	public List<Manutencao> obterLista() {
		return (List<Manutencao>) repository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	public void incluir(Manutencao manutencao) {
		repository.save(manutencao);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public Manutencao obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
