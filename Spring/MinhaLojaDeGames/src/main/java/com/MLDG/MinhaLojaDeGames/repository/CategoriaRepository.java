package com.MLDG.MinhaLojaDeGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MLDG.MinhaLojaDeGames.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{

	Object findAllByCategoriaContainingIgnoreCase(String categoria);

}
