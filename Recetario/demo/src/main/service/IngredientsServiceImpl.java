import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IngredientsServiceImpl implements IngredientesService {

    private final RecetaRepository RecetaRepository;
    private final IngredientesService IngredientesService;

@Override
    public List<Receta> getRecetaIngredientes(){
        List<Ingredientes> ingredientes = this.RecetaRepository.findAll()
            .stream()
            .map(Ingredientes)
            .collect(Collectors.toList());
        
        return ingredientes;
    }

    @Override
    public void deleteIngredientFromReceta(Integer pk_RecetaId){
        Optional<Receta> p = this.RecetaRepository.findById(pk_RecetaId);
        List<Ingredientes> listaIngredientes = p.get().getlistIngredientes();
        this.RecetaRepository.deleteAllInBranch(p);
    }
}
