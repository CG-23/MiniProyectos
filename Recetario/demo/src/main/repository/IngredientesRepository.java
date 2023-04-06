import org.springframework.stereotype.Repository;

@Repository
public interface IngredientesRepository extends JpaRepository <Ingredientes, Integer>{

    List<Receta> findByNombre(String nombreReceta);
    
}
