package br.com.infnet.almoxarifado.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.almoxarifado.model.negocio.Usuario;
import br.com.infnet.almoxarifado.model.repository.IUsuarioRepository;

@Service
public class LoginService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	public boolean isValid(String login, String senha) {
		return usuarioRepository.autenticacao(login, senha) != null;
	}

	public Usuario userExist(String login) {
		return usuarioRepository.findByLogin(login);
	}
}
