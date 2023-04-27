package biblioteca.biblioteca.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.biblioteca.Entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    
    Optional<Libro> findByTitulo(String titulo);
}
