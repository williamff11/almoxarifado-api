package br.com.infnet.almoxarifado.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.almoxarifado.model.negocio.Usuario;
import br.com.infnet.almoxarifado.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private IUsuarioRepository repository;

	public void incluir(Usuario solicitante) {
		repository.save(solicitante);
	}
	
	public List<Usuario> obterLista() {
		return (List<Usuario>)repository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	public void excluir(Integer id) {
		repository.deleteById(id);		
	}

	public Usuario obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
