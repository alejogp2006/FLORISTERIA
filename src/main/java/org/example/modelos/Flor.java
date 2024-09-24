package org.example.modelos;

public class Flor {
    Integer id;
    String nombre;
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

    public Flor(Integer id, String nombre, String color, Double tamaño, String duracion, String habitat, Integer numeroPetalos, String precio, String fragancia, String tiempoCrecimiento) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.tamaño = tamaño;
        this.duracion = duracion;
        this.habitat = habitat;
        this.numeroPetalos = numeroPetalos;
        this.precio = precio;
        this.fragancia = fragancia;
        this.tiempoCrecimiento = tiempoCrecimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}
