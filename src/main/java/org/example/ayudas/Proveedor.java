package org.example.ayudas;

public class Proveedor {
    Integer id;
    String nombre;
    String apellido;
    String cedula;
    String telefono;
    String correo;
    String direccion;
    Double tarifas;
    String certificaciones;
    String condicionesPago;

    public Proveedor() {
    }

    public Proveedor(Integer id, String nombre, String apellido, String cedula, String telefono, String correo, String direccion, Double tarifas, String certificaciones, String condicionesPago) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.tarifas = tarifas;
        this.certificaciones = certificaciones;
        this.condicionesPago = condicionesPago;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getTarifas() {
        return tarifas;
    }

    public void setTarifas(Double tarifas) {
        this.tarifas = tarifas;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public String getCondicionesPago() {
        return condicionesPago;
    }

    public void setCondicionesPago(String condicionesPago) {
        this.condicionesPago = condicionesPago;
    }
}

