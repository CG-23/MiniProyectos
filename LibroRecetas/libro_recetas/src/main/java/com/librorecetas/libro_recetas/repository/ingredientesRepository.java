package com.librorecetas.libro_recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librorecetas.libro_recetas.model.ingredientes;
@Repository
public interface ingredientesRepository extends JpaRepository<ingredientes, Integer> {
    
 }