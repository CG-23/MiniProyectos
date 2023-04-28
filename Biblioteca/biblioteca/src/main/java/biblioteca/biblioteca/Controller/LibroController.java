package biblioteca.biblioteca.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.biblioteca.Entity.Libro;
import biblioteca.biblioteca.ServiceInterface.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path="libro")
@AllArgsConstructor
public class LibroController {

    private final LibroService libroService;

    @GetMapping
    public List<Libro> getAllLibros(){
        return libroService.getAllLibros();
    } 

    @GetMapping(value = "/{libroId}")
    public Optional<Libro> getLibro(@PathVariable(name = "libroId") Long libroId) {
        return libroService.getLibro(libroId);
    }

    @DeleteMapping(value = "/{titulo}")
    public void deleteLibro(@PathVariable(name = "titulo") String titulo){
        libroService.deleteLibro(titulo);
    }
    
    @PutMapping
    public Libro updateLibro(@RequestBody Libro libro) {
        return libroService.updateLibro(libro);
    }

    @PostMapping
    public Libro newLibro(@RequestBody Libro libro) {
        return libroService.updateLibro(libro);
    }
    
}
