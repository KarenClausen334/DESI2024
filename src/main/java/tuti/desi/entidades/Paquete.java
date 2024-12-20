package tuti.desi.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paquetes")
public class Paquete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura como autoincremental
    private Long idPaquete;

    private String origen;
    private String destino;
    private double peso;
    private boolean fragil;
    private String dniRemitente;
    private String dniDestinatario;

    // Getters y Setters
    public Long getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Long idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public String getDniRemitente() {
        return dniRemitente;
    }

    public void setDniRemitente(String dniRemitente) {
        this.dniRemitente = dniRemitente;
    }

    public String getDniDestinatario() {
        return dniDestinatario;
    }

    public void setDniDestinatario(String dniDestinatario) {
        this.dniDestinatario = dniDestinatario;
    }
}
