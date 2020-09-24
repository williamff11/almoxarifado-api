package br.com.infnet.almoxarifado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.almoxarifado.model.negocio.Informatica;
import br.com.infnet.almoxarifado.model.service.InformaticaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/produtos/informatica")
public class InformaticaController {

	@Autowired
	private InformaticaService service;

	@ApiOperation(value = "Retornar uma lista de Produtos de Informatica")
	@GetMapping
	public List<Informatica> obterLista() {
		return service.obterLista();
	}

	@ApiOperation(value = "Retornar um Produto da Categoria Informatica")
	@GetMapping(value = "/{id}")
	public Informatica obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
}
