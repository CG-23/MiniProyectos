package com.librorecetas.libro_recetas.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.librorecetas.libro_recetas.model.receta;

@Repository
public interface recetaRepository extends JpaRepository<receta, Integer> {
    List<receta> findByNombre(String nombre);   
 }