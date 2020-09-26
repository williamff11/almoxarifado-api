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
import br.com.infnet.almoxarifado.model.service.SetorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/setores")
public class SetorController {

	@Autowired
	private SetorService service;

	@ApiOperation(value = "Retorna uma lista de setores")
	@GetMapping
	public List<Setor> obterLista() {
		return service.obterLista();
	}

	@ApiResponses(value = { @ApiResponse(code = 422, message = "Dados Inválidos para a Criação"), })
	@ApiOperation(value = "Cadastra um novo Setor")
	@PostMapping
	public void incluir(@RequestBody Setor setor) {
		service.incluir(setor);
	}

	@ApiOperation(value = "Exclui um Setor")
	@GetMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	@ApiOperation(value = "Retorna um Setor")
	@GetMapping(value = "/{id}")
	public Setor obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
}
