package com.librorecetas.libro_recetas.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librorecetas.libro_recetas.model.ingredientes;
import com.librorecetas.libro_recetas.model.receta;
import com.librorecetas.libro_recetas.services.serviceInterfaces.recetaService;
import com.librorecetas.libro_recetas.services.serviceInterfaces.ingredientesService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/receta")
@AllArgsConstructor
public class recetaController {
    public final recetaService recetaService;
    public final ingredientesService ingredientesService;

    @PostMapping(value = "")
    public ResponseEntity<?> createNewReceta(@RequestBody(required = true) receta receta) {
        receta receta1 = this.recetaService.newreceta(receta);
        return ResponseEntity.status(HttpStatus.CREATED).body(receta1);
    }

    @PutMapping(value = "")
    public ResponseEntity<?> updateReceta(@RequestBody(required = true)receta receta) {
        receta receta1 = this.recetaService.updatereceta(receta);
        return ResponseEntity.status(HttpStatus.OK).body(receta1);
    }

    @DeleteMapping(value = "/{id}/ingredientes")
    public ResponseEntity<Void> deleteIngredientesReceta(@PathVariable(name = "id") Integer pk_RecetaId) {
        this.ingredientesService.deleteIngredientFromReceta(pk_RecetaId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    
    @GetMapping(value = "")
    public ResponseEntity <List<receta>> getAllRecetas() {
        List<receta> list = this.recetaService.getAllrecetas();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteReceta(@PathVariable(name = "id") Integer pk_RecetaId) {
        this.recetaService.deletereceta(pk_RecetaId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(value = "/{id}/ingredientes")
    public ResponseEntity <List<ingredientes>> getAllIngredientesReceta(@PathVariable(name = "id") Integer pk_RecetaId) {
        List<ingredientes> list = this.ingredientesService.getRecetaIngredientes(pk_RecetaId);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
