package org.example.modelos;

public class Flor {
    Integer idFlor;
    String nombreFlor;
    String color;
    Double tamaño;
    String duracion;
    String habitat;
    Integer numeroPetalos;
    String precio;
    String fragancia;
    String tiempoCrecimiento;

    public Flor() {
    }

    public Flor(Integer idFlor, String nombreFlor, String color, Double tamaño, String duracion, String habitat, Integer numeroPetalos, String precio, String fragancia, String tiempoCrecimiento) {
        this.idFlor = idFlor;
        this.nombreFlor = nombreFlor;
        this.color = color;
        this.tamaño = tamaño;
        this.duracion = duracion;
        this.habitat = habitat;
        this.numeroPetalos = numeroPetalos;
        this.precio = precio;
        this.fragancia = fragancia;
        this.tiempoCrecimiento = tiempoCrecimiento;
    }

    public Integer getIdFlor() {
        return idFlor;
    }

    public void setIdFlor(Integer idFlor) {
        this.idFlor = idFlor;
    }

    public String getNombreFlor() {
        return nombreFlor;
    }

    public void setNombreFlor(String nombreFlor) {
        this.nombreFlor = nombreFlor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Integer getNumeroPetalos() {
        return numeroPetalos;
    }

    public void setNumeroPetalos(Integer numeroPetalos) {
        this.numeroPetalos = numeroPetalos;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    public String getTiempoCrecimiento() {
        return tiempoCrecimiento;
    }

    public void setTiempoCrecimiento(String tiempoCrecimiento) {
        this.tiempoCrecimiento = tiempoCrecimiento;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "idFlor=" + idFlor +
                ", nombreFlor='" + nombreFlor + '\'' +
                ", color='" + color + '\'' +
                ", tamaño=" + tamaño +
                ", duracion='" + duracion + '\'' +
                ", habitat='" + habitat + '\'' +
                ", numeroPetalos=" + numeroPetalos +
                ", precio='" + precio + '\'' +
                ", fragancia='" + fragancia + '\'' +
                ", tiempoCrecimiento='" + tiempoCrecimiento + '\'' +
                '}';
    }
}
