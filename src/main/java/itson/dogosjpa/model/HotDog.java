package itson.dogosjpa.model;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "hotdogs")
public class HotDog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;

    @Transient
    private Double iva;

    public Long getId() {
        return id; 
    }
    
    public void setId(Long id) {
        this.id = id; 
    }

    public String getNombre() {
        return nombre; 
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public Double getPrecio() {
        return precio; 
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio; 
    }

    public Double getIva() {
        return iva; 
    }
    
    public void setIva(Double iva) {
        this.iva = iva; 
    }
}