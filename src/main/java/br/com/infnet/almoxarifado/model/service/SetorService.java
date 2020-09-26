package br.com.infnet.almoxarifado.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.almoxarifado.model.negocio.Setor;
import br.com.infnet.almoxarifado.model.repository.ISetorRepository;

@Service
public class SetorService {

	@Autowired
	private ISetorRepository repository;

	public List<Setor> obterLista() {
		return (List<Setor>)repository.findAll();
	}

	public void incluir(Setor contato) {
		repository.save(contato);
	}
	
	public Setor obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
