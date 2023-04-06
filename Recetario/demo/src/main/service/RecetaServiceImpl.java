import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RecetaServiceImpl implements RecetaService {
    private final RecetaRepository RecetaRepository;
    private final IngredientesService IngredientesService;

    @Override
    public Receta newReceta(Receta receta){
        Receta newR = Receta.builder()
            .nombreReceta(Receta.nombreReceta)
            .fechaRegistro(new RecetaServiceImpl())
            .listIngredientes(new ArrayList<Ingredientes>())
            .tipoReceta(Receta.tipoReceta)
            .preparacionReceta(Receta.preparacionReceta)
            .imagenReceta(Recta.imagenReceta)
            .build();
            
        newR = this.RecetaRepository.save(newR);
        return newR;
    }

    @Override
    public List<Receta> getAllRecetas(){
        List<Receta> recetas = this.RecetaRepository.findAll()
            .stream()
            .map(Receta)
            .collect(Collectors.toList());
        
        return recetas;
    }

    @Override
    public Receta updateReceta(Receta receta){
        Optional<Receta> RecetaOp = this.RecetaRepository.findById(Recta.pk_RecetaId);
        Receta p = RecetaOp.get();
        p.setNombre(Receta.nombreReceta);
        p = this.RecetaRepository.save(p);
        return p;
    }

    @Override
    public void deleteReceta(Integer pk_RecetaId){
        Optional<Receta> p = this.RecetaRepository.findById(pk_RecetaId);
        this.RecetaRepository.deleteAllInBranch(p);
    }
}
