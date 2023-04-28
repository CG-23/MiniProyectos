package biblioteca.biblioteca.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import biblioteca.biblioteca.Entity.Libro;
import biblioteca.biblioteca.Repository.LibroRepository;
import biblioteca.biblioteca.ServiceInterface.LibroService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LibroServiceImpl implements LibroService {
    
    private final LibroRepository libroRepository;

    @Override
    public Libro newLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro updateLibro(Libro libro) {
        return  libroRepository.save(libro);  
    }

    @Override
    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> getLibro(Long libroId){
        return libroRepository.findById(libroId);
    }

    @Override
    public void deleteLibro(String titulo) {
        Optional<Libro> oLibro = libroRepository.findByTitulo(titulo);
        Libro deLibro = oLibro.get();
        libroRepository.delete(deLibro);
    }

    
}
