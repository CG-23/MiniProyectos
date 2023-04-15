package com.librorecetas.libro_recetas.services.serviceInterfaces;

import java.util.List;

import com.librorecetas.libro_recetas.model.receta;

public interface recetaService {
    public receta newreceta(receta receta);
    public receta updatereceta(receta receta);
    public List<receta> getAllrecetas();
    public void deletereceta(Integer pk_RecetaId);
}
