package biblioteca.biblioteca.ServiceInterface;


import java.util.List;
import java.util.Optional;

import biblioteca.biblioteca.Entity.Libro;

public interface LibroService {
    
    public Libro newLibro(Libro libro);
    public Libro updateLibro(Libro libro);
    public List<Libro> getAllLibros();
    public Optional<Libro> getLibro(Long libroId);
    public void deleteLibro(String titulo);
}
