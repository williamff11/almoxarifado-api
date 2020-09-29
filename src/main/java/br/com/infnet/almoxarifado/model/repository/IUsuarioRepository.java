package br.com.infnet.almoxarifado.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.almoxarifado.model.negocio.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {

	List<Usuario> findAll(Sort by);
	
	@Query("from Usuario u where u.login =:login and u.senha =:senha")
	Usuario autenticacao(String login, String senha);
	
	Usuario findByLogin(String login);
}
