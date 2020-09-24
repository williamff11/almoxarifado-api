package br.com.infnet.almoxarifado.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.almoxarifado.model.negocio.Papelaria;
import br.com.infnet.almoxarifado.model.repository.IPapelariaRepository;

@Service
public class PapelariaService {

	@Autowired
	private IPapelariaRepository repository;

	public List<Papelaria> obterLista() {
		return (List<Papelaria>) repository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	public void incluir(Papelaria papelaria) {
		repository.save(papelaria);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public Papelaria obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
