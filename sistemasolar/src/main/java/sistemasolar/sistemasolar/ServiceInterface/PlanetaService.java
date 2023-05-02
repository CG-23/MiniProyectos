package sistemasolar.sistemasolar.ServiceInterface;

import java.util.List;
import java.util.Optional;

import sistemasolar.sistemasolar.Entity.Planeta;

public interface PlanetaService {
    
    public Planeta newPlaneta(Planeta planeta);
    public Planeta updatePlaneta(Planeta planeta);
    public List<Planeta> getAllPlanetas();
    public Optional<Planeta> getPlaneta(Long planetaId);
    public void deletePlaneta(String nombre);
}

