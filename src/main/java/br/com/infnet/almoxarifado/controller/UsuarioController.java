package br.com.infnet.almoxarifado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.almoxarifado.model.negocio.Setor;
import br.com.infnet.almoxarifado.model.negocio.Usuario;
import br.com.infnet.almoxarifado.model.service.UsuarioService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired 
	private UsuarioService service;

	@ApiOperation(value = "Retornar uma lista de solicitantes")
	@GetMapping()
	public List<Usuario> obterLista() {
		return service.obterLista(); 
	}
	
	@ApiOperation(value = "Retornar uma solicitante")
	@GetMapping(value = "/{id}")
	public Usuario obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}

	@ApiResponses(value = { @ApiResponse(code = 422, message = "Dados Inválidos para a Criação"), })
	@ApiOperation(value = "Cadastrar um novo solicitante")
	@PostMapping()
	public void incluir(@RequestBody Usuario solicitante) {
		service.incluir(solicitante);
	}
	
	@ApiOperation(value = "Remover um solicitante existente")
	@GetMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}
}
