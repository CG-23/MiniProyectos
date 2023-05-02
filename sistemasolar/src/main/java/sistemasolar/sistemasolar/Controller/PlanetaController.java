package sistemasolar.sistemasolar.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sistemasolar.sistemasolar.Entity.Planeta;
import sistemasolar.sistemasolar.ServiceInterface.PlanetaService;

@RestController
@RequestMapping(path="planetas")
@AllArgsConstructor
public class PlanetaController {
    private final PlanetaService planetaService;

    @GetMapping
    public List<Planeta> getAllPlanetas(){
        return planetaService.getAllPlanetas();
    } 

    @GetMapping(value = "/{planetaId}")
    public Optional<Planeta> getLibro(@PathVariable(name = "planetaId") Long planetaId) {
        return planetaService.getPlaneta(planetaId);
    }

    @DeleteMapping(value = "/{nombre}")
    public void deleteLibro(@PathVariable(name = "nombre") String nombre){
        planetaService.deletePlaneta(nombre);
    }
    
    @PutMapping
    public Planeta updateLibro(@RequestBody Planeta planeta) {
        return planetaService.updatePlaneta(planeta);
    }

    @PostMapping
    public Planeta newPlaneta(@RequestBody Planeta planeta) {
        return planetaService.newPlaneta(planeta);
    }
}
