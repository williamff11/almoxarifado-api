package br.com.infnet.almoxarifado.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.almoxarifado.model.negocio.Papelaria;


@Repository
public interface IPapelariaRepository extends CrudRepository<Papelaria, Integer> {

	List<Papelaria> findAll(Sort by);
}
