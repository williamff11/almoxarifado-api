package br.com.infnet.almoxarifado.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.almoxarifado.model.negocio.Informatica;
import br.com.infnet.almoxarifado.model.repository.IInformaticaRepository;

@Service
public class InformaticaService {

	@Autowired
	private IInformaticaRepository repository;

	public List<Informatica> obterLista() {
		return (List<Informatica>) repository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	public void incluir(Informatica informatica) {
		repository.save(informatica);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public Informatica obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
