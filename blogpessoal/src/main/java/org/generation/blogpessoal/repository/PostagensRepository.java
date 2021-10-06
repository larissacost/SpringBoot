package org.generation.blogpessoal.repository;

import java.util.List;

import org.generation.blogpessoal.model.Postagens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagensRepository extends JpaRepository <Postagens,Long>{
	public List <Postagens> findAllByTituloContainingIgnoreCase(String titulo);
}
