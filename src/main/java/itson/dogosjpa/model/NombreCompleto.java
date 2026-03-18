package itson.dogosjpa.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Ricardo
 */
@Embeddable
public class NombreCompleto implements Serializable {
    private String nombre;
    private String apPaterno;
    private String apMaterno;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    
}