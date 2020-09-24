package br.com.infnet.almoxarifado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.almoxarifado.model.negocio.Solicitacao;
import br.com.infnet.almoxarifado.model.service.SolicitacaoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/solicitacoes")
public class SolicitacaoController {

	@Autowired
	private SolicitacaoService service;

	@ApiOperation(value = "Retorna uma lista de Solicitações")
	@GetMapping()
	public List<Solicitacao> obterLista() {
		return service.obterLista();
	}

	@ApiResponses(value = { @ApiResponse(code = 422, message = "Dados Inválidos para a Criação"), })
	@ApiOperation(value = "Cadastra uma Solicitação")
	@PostMapping()
	public void incluir(@RequestBody Solicitacao emprestimo) {
		service.incluir(emprestimo);
	}

	@ApiOperation(value = "Exclui uma Solicitação")
	@GetMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	@ApiOperation(value = "Retorna uma Solicitação")
	@GetMapping(value = "/{id}")
	public Solicitacao consultar(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
}
