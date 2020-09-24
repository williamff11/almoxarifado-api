package br.com.infnet.almoxarifado.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.almoxarifado.model.negocio.Manutencao;

@Repository
public interface IManutencaoRepository extends CrudRepository<Manutencao, Integer> {
	
	List<Manutencao> findAll(Sort by);
}
