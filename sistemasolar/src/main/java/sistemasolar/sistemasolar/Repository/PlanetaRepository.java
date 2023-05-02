package sistemasolar.sistemasolar.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemasolar.sistemasolar.Entity.Planeta;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Long> {
    
    Optional<Planeta> findByNombre(String nombre);
}
