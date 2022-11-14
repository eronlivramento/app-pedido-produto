package br.edu.infnet.appproduto.model.domain.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.appproduto.model.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	Usuario findByEmail(String email);

}
