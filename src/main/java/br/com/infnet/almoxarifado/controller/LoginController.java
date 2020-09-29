package br.com.infnet.almoxarifado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.almoxarifado.model.negocio.Usuario;
import br.com.infnet.almoxarifado.model.service.LoginService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private LoginService service;
	
	@ApiOperation(value = "Caso o login esteja certo, retorna um usuário, senão retorna null")
	@PostMapping
	public Usuario autenticacao(@RequestParam String login, @RequestParam String senha) {

		Usuario usuario = service.userExist(login);

		if (usuario == null) {
			return null;

		} else if (!service.isValid(login, senha)) {
			return null;

		} else {
			return usuario;
		}
	}
}
