package org.example.ayudas;

import java.time.LocalDate;

public class Repartidor {
    Integer id;
    String nombre;
    String apellido;
    String cedula;
    String telefono;
    Integer numeroPedidos;
    String direccionPedido;
    LocalDate fechaEntrega;
    String placa;
    Double precioPedido;

    public Repartidor() {
    }

    public Repartidor(Integer id, String nombre, String apellido, String cedula, String telefono, Integer numeroPedidos, String direccionPedido, LocalDate fechaEntrega, String placa, Double precioPedido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.numeroPedidos = numeroPedidos;
        this.direccionPedido = direccionPedido;
        this.fechaEntrega = fechaEntrega;
        this.placa = placa;
        this.precioPedido = precioPedido;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getNumeroPedidos() {
        return numeroPedidos;
    }

    public void setNumeroPedidos(Integer numeroPedidos) {
        this.numeroPedidos = numeroPedidos;
    }

    public String getDireccionPedido() {
        return direccionPedido;
    }

    public void setDireccionPedido(String direccionPedido) {
        this.direccionPedido = direccionPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPrecioPedido() {
        return precioPedido;
    }

    public void setPrecioPedido(Double precioPedido) {
        this.precioPedido = precioPedido;
    }
}
