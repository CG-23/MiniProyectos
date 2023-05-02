package sistemasolar.sistemasolar.Entity;

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
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "tbl_planetas")
public class Planeta{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID", unique = true, nullable = false)
    private Long planetaId;
    @Column(name ="nombre")
    private String nombre;
    @Column(name ="masa")
    private double masa;
    @Column(name ="radio")
    private double radio;
    @Column(name ="gravedad")
    private double gravedad;
    @Column(name ="periodo_rotacion")
    private String protacion;
    @Column(name ="periodo_orbital")
    private String porbital;   
}
