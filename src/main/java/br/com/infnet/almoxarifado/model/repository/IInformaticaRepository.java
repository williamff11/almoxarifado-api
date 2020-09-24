package br.com.infnet.almoxarifado.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.almoxarifado.model.negocio.Informatica;

@Repository
public interface IInformaticaRepository extends CrudRepository<Informatica, Integer> {

	List<Informatica> findAll(Sort by);
}
