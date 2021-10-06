package org.generation.blogpessoal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.generation.blogpessoal.model.Postagens;
import org.generation.blogpessoal.repository.PostagensRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*") // libera cabeçalho da requisão ,para introduzir segurança
public class PostagensController {

	@Autowired
	private PostagensRepository postagensRepository;

	@GetMapping
	public ResponseEntity <List<Postagens>> getAll (){
		return ResponseEntity.ok(postagensRepository.findAll());		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagens> getById(@PathVariable long id) {
		return postagensRepository.findById(id)
			.map(resposta -> ResponseEntity.ok(resposta))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagens>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(postagensRepository.findAllByTituloContainingIgnoreCase(titulo));
	}

	@PostMapping
	public ResponseEntity<Postagens> postPostagens (@RequestBody Postagens postagens){
		return ResponseEntity.status(HttpStatus.CREATED).body(postagensRepository.save(postagens));
	}
	
	@PutMapping
	public ResponseEntity<Postagens> putPostagens (@RequestBody Postagens postagens){
		return ResponseEntity.status(HttpStatus.OK).body(postagensRepository.save(postagens));
	}
	
	@DeleteMapping("/{id}")
	public void deletePostagens(@PathVariable long id) {
		postagensRepository.deleteById(id);
	}	
	
	
	
	
}
