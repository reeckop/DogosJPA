package itson.dogosjpa.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCliente;

    @Embedded
    private NombreCompleto nombre;

    private LocalDate fchNac;

    @Transient
    private Integer edad;

    @ElementCollection
    private List<String> telefonos;

    @ElementCollection
    private List<String> preferencias;

    @ManyToOne
    @JoinColumn(name = "recomendado_por")
    private Cliente recomienda;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    public Long getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(Long numCliente) {
        this.numCliente = numCliente;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }

    public void setNombre(NombreCompleto nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFchNac() {
        return fchNac;
    }

    public void setFchNac(LocalDate fchNac) {
        this.fchNac = fchNac;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    public List<String> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(List<String> preferencias) {
        this.preferencias = preferencias;
    }

    public Cliente getRecomienda() {
        return recomienda;
    }

    public void setRecomienda(Cliente recomienda) {
        this.recomienda = recomienda;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
}