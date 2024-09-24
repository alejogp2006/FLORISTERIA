package org.example.modelos;

import java.time.LocalDate;

public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private Boolean domicilioConfirmado;
    private String correo;
    private String ocasion;
    private Double presupuesto;
    private String mensajeTarjeta;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellido, String telefono, String direccion, Boolean domicilioConfirmado, String correo, String ocasion, Double presupuesto, String mensajeTarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.domicilioConfirmado = domicilioConfirmado;
        this.correo = correo;
        this.ocasion = ocasion;
        this.presupuesto = presupuesto;
        this.mensajeTarjeta = mensajeTarjeta;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDomicilioConfirmado() {
        return domicilioConfirmado;
    }

    public void setDomicilioConfirmado(Boolean domicilioConfirmado) {
        this.domicilioConfirmado = domicilioConfirmado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getOcasion() {
        return ocasion;
    }

    public void setOcasion(String ocasion) {
        this.ocasion = ocasion;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getMensajeTarjeta() {
        return mensajeTarjeta;
    }

    public void setMensajeTarjeta(String mensajeTarjeta) {
        this.mensajeTarjeta = mensajeTarjeta;
    }
}
