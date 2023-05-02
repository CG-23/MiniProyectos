package sistemasolar.sistemasolar.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sistemasolar.sistemasolar.Entity.Planeta;
import sistemasolar.sistemasolar.Repository.PlanetaRepository;
import sistemasolar.sistemasolar.ServiceInterface.PlanetaService;

@Service
@AllArgsConstructor
public class PlanetaServiceImpl implements PlanetaService{
    private final PlanetaRepository planetaRepository;
    
    @Override
public Planeta newPlaneta(Planeta planeta) {
    Planeta planeta1 = Planeta.builder()
        .nombre(planeta.getNombre())
        .masa(planeta.getMasa())
        .radio(planeta.getRadio())
        .gravedad(planeta.getGravedad())
        .protacion(planeta.getProtacion())
        .porbital(planeta.getPorbital())
        .build();
    
    planetaRepository.save(planeta1);

    return planeta1;
}

    @Override
    public Planeta updatePlaneta(Planeta planeta) {
        Optional<Planeta> planetaop = planetaRepository.findById(planeta.getPlanetaId());
        Planeta p = planetaop.get();
        p.setNombre(planeta.getNombre());
        p.setMasa(planeta.getMasa());
        p.setRadio(planeta.getRadio());
        p.setGravedad(planeta.getGravedad());
        p.setProtacion(planeta.getProtacion());
        p.setPorbital(planeta.getPorbital());
        planetaRepository.save(p);

        return p ;
    }

    @Override
    public List<Planeta> getAllPlanetas() {
        return planetaRepository.findAll();
    }

    @Override
    public Optional<Planeta> getPlaneta(Long planetaId) {
        return planetaRepository.findById(planetaId);
    }

    @Override
    public void deletePlaneta(String nombre) {
        Optional<Planeta> oPlaneta = planetaRepository.findByNombre(nombre);
        Planeta dePlaneta = oPlaneta.get();
        planetaRepository.delete(dePlaneta);
    }
    
}
