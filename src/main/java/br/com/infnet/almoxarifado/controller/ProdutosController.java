package br.com.infnet.almoxarifado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.almoxarifado.model.negocio.Produto;
import br.com.infnet.almoxarifado.model.service.ProdutoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

	@Autowired
	private ProdutoService service;

	@ApiResponses(value = { @ApiResponse(code = 422, message = "Dados Inválidos para a Criação"), })
	@ApiOperation(value = "Cadastra um novo produto")
	@PostMapping()
	public void incluir(@RequestBody Produto produto) {
		service.incluir(produto);
	}

	@ApiOperation(value = "Retorna uma lista de produtos")
	@GetMapping()
	public List<Produto> obterLista() {
		return service.obterLista();
	}

	@ApiOperation(value = "Exclui um produto existente")
	@GetMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	@ApiOperation(value = "Retorna um produto")
	@GetMapping(value = "/{id}")
	public Produto obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
}
