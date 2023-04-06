import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/receta")
@AllArgsConstructor
public class RecetaController {
    private final RecetaService recetaService;
    private final IngredientesService ingredientesService;

    @PostMapping(value = "")
    public ResponseEntity<?> createNewReceta(@RequestBody(required = true) Receta receta) {
        Receta receta2 = this.playerService.createNewPlayer(receta);
        return ResponseEntity.status(HttpStatus.CREATED).body(receta2);
    }

    @PutMapping(value = "")
    public ResponseEntity<?> updateReceta(@RequestBody(required = true)Receta receta) {
        Receta receta2 = this.playerService.updatePlayer(receta);
        return ResponseEntity.status(HttpStatus.OK).body(receta2);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteReceta(@PathVariable(name = "id") Integer pk_RecetaId) {
        this.RecetaService.deleteReceta(pk_RecetaId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteIngredientesReceta(@PathVariable(name = "id") Integer pk_RecetaId) {
        this.IngredientesService.deleteIngredientesReceta(pk_RecetaId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Receta>> getRecetas() {
        List<Receta> list = this.RecetaService.getAllRecetas();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
