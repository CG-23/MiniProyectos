package biblioteca.biblioteca.Entity;

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

@Data
@Entity
@Table(name = "tbl_libro")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID", unique = true, nullable = false)
    private Long libroId;
    @Column(name ="titulo", nullable = false)
    private String titulo;
    @Column(name ="autor")
    private String autor;
    @Column(name ="año_publi")
    private int añoPublicado;
    @Column(name ="ISBN", unique = true, nullable = false)
    private long ISBN;
    @Column(name ="num_paginas", nullable = false)
    private int paginas;
    @Column(name ="genero_libro")
    private Genero genero;

}
