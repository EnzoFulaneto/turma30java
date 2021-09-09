package com.MLDG.MinhaLojaDeGames.controller;

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

import com.MLDG.MinhaLojaDeGames.model.Produto;
import com.MLDG.MinhaLojaDeGames.repository.ProdutoRepository;

@RestController
@RequestMapping ("/produtos")
@CrossOrigin (value = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired 
	private ProdutoRepository repository;
	
//----------FIND ALL PRODUTO
	@GetMapping
	public ResponseEntity <List<Produto>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	 
//----------FIND BY ID
	@GetMapping ("/{id}")
	public ResponseEntity <Produto> GetById (@PathVariable long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse (ResponseEntity.notFound().build());
	}
	
//---------FIND BY PRODUTO
	@GetMapping ("/produto/{produtos}")
	public ResponseEntity <List<Produto>> GetByProduto (@PathVariable String produto) {
		return ResponseEntity.ok(repository.findAllByProdutoContainingIgnoreCase(produto));
	}
	
//---------POST
	@PostMapping 
	public ResponseEntity <Produto> post (@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}

//----------PUT
	@PutMapping
	public ResponseEntity <Produto> put (@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}
	
//----------DELETE
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable long id) {
		repository.deleteById(id);
	}
}