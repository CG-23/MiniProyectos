package com.librorecetas.libro_recetas.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.librorecetas.libro_recetas.model.ingredientes;
import com.librorecetas.libro_recetas.model.receta;
import com.librorecetas.libro_recetas.repository.ingredientesRepository;
import com.librorecetas.libro_recetas.services.serviceInterfaces.ingredientesService;
import com.librorecetas.libro_recetas.repository.recetaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ingredientesServiceImpl implements ingredientesService {
    private final recetaRepository recetaRepository;
    private final ingredientesRepository ingredientesRepository;
    @Override
    public void deleteIngredientFromReceta(Integer pk_RecetaId) {
        Optional<receta> recetaOp = this.recetaRepository.findById(pk_RecetaId);
        receta p = recetaOp.get();
        List<ingredientes> ing = p.getListIngredientes();
        this.ingredientesRepository.deleteAll(ing);
    }
    @Override
    public List<ingredientes> getRecetaIngredientes(Integer pk_RecetaId) {
        Optional<receta> recetaOp = this.recetaRepository.findById(pk_RecetaId);
        receta p = recetaOp.get();
        List<ingredientes> ing = p.getListIngredientes()
            .stream()
            .map(ingredientes -> com.librorecetas.libro_recetas.model.ingredientes.builder()
                .nombre(ingredientes.getNombre())
                .cantidad(ingredientes.getCantidad())
                .build())
            .collect(Collectors.toList());
        
        return ing;
    }
}