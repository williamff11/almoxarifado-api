package br.com.infnet.almoxarifado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.almoxarifado.model.negocio.Manutencao;
import br.com.infnet.almoxarifado.model.service.ManutencaoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/produtos/manutencao")
public class ManutencaoController {

	@Autowired
	private ManutencaoService service;

	@ApiOperation(value = "Retornar uma lista de Produtos de Manutenção")
	@GetMapping
	public List<Manutencao> obterLista() {
		return service.obterLista();
	}

	@ApiOperation(value = "Retornar um Produto da Categoria Manutenção")
	@GetMapping(value = "/{id}")
	public Manutencao obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
}
