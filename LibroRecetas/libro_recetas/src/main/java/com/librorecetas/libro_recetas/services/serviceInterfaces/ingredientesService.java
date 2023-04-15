package com.librorecetas.libro_recetas.services.serviceInterfaces;

import java.util.List;

import com.librorecetas.libro_recetas.model.ingredientes;

public interface ingredientesService {
    public void deleteIngredientFromReceta(Integer pk_RecetaId);
    public List<ingredientes> getRecetaIngredientes(Integer pk_RecetaId);
}
