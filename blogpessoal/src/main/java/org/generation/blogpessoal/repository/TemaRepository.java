package org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.generation.blogpessoal.model.Tema;

public interface TemaRepository  extends JpaRepository <Tema, Long>{
    
    public List <Tema> findAllByDescricaoContainingIgnoreCase (String descricao);

}
