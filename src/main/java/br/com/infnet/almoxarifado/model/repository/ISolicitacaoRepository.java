package br.com.infnet.almoxarifado.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.almoxarifado.model.negocio.Solicitacao;

@Repository
public interface ISolicitacaoRepository extends CrudRepository<Solicitacao, Integer> {
	
	List<Solicitacao> findAll(Sort by);
}
