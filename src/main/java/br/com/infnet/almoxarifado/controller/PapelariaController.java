package br.com.infnet.almoxarifado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.almoxarifado.model.negocio.Papelaria;
import br.com.infnet.almoxarifado.model.service.PapelariaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/produtos/papelaria")
public class PapelariaController {

	@Autowired
	private PapelariaService service;

	@ApiOperation(value = "Retornar uma lista de Produtos de Papelaria")
	@GetMapping
	public List<Papelaria> obterLista() {
		return service.obterLista();
	}

	@ApiOperation(value = "Retornar um Produto da Categoria Papelaria")
	@GetMapping(value = "/{id}")
	public Papelaria obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
}
