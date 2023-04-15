package com.librorecetas.libro_recetas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.librorecetas.libro_recetas.model.ingredientes;
import com.librorecetas.libro_recetas.model.receta;
import com.librorecetas.libro_recetas.repository.recetaRepository;
import com.librorecetas.libro_recetas.services.serviceInterfaces.recetaService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class recetaServiceImpl implements recetaService {
    private final recetaRepository recetaRepository;

    @Override
    public receta newreceta(receta receta1){
        ArrayList<ingredientes> listaIn = new ArrayList<ingredientes>();
        receta newR = receta.builder()
            .nombreReceta(receta1.getNombreReceta())
            .listIngredientes(listaIn)
            .tipoReceta(receta1.getTipoReceta())
            .preparacionReceta(receta1.getPreparacionReceta())
            .imagenReceta(receta1.getImagenReceta())
            .build();
            
        newR = this.recetaRepository.save(newR);
        return newR;
    }

    @Override
    public List<receta> getAllrecetas(){
        ArrayList<ingredientes> listaIn = new ArrayList<ingredientes>();
        List<receta> recetas = this.recetaRepository.findAll()
            .stream()
            .map(receta -> com.librorecetas.libro_recetas.model.receta.builder()
                .nombreReceta(receta.getNombreReceta())
                .listIngredientes(listaIn)
                .tipoReceta(receta.getTipoReceta())
                .preparacionReceta(receta.getPreparacionReceta())
                .imagenReceta(receta.getImagenReceta())
                .build())
            .collect(Collectors.toList());
        
        return recetas;
    }

    @Override
    public receta updatereceta(receta receta){
        Optional<receta> RecetaOp = this.recetaRepository.findById(receta.getPk_RecetaId());
        receta p = RecetaOp.get();
        p.setNombreReceta(receta.getNombreReceta());
        p = this.recetaRepository.save(p);
        return p;
    }

    @Override
    public void deletereceta(Integer pk_RecetaId){
        Optional<receta> p = this.recetaRepository.findById(pk_RecetaId);
        p.ifPresent(this.recetaRepository::delete);
        
    }
}