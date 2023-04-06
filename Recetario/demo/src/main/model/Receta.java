import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "tbl_recetas")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer pk_RecetaId;
    @Column(name = "receta")
    private String nombreReceta;
    @Column(name = "imagen")
    private Image imagenReceta;
    @Column(name = "tipo")
    private String tipoReceta;
    @Column(name = "descripcion")
    private Text preparacionReceta;

    @OneToMany(mappedBy = "Receta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private List<Ingredientes> listIngredientes;
    
}
