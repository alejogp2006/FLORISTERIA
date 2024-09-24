package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente(
                1,
                "Fernando",
                "Gutierrez",
                "3024678746",
                "calle 50 # 60-12",
                true,
                "fernandog@gmail.com",
                "cumpleaños",
                100000.10,
                "Feliz Cumpleaños");

        System.out.println(clienteUno.getId());
        System.out.println(clienteDos.getId());
        System.out.println(clienteUno.getNombre());
        System.out.println(clienteDos.getNombre());
        System.out.println(clienteUno.getApellido());
        System.out.println(clienteDos.getApellido());
        System.out.println(clienteUno.getTelefono());
        System.out.println(clienteDos.getTelefono());
        System.out.println(clienteUno.getDireccion());
        System.out.println(clienteDos.getDireccion());
        System.out.println(clienteUno.getDomicilioConfirmado());
        System.out.println(clienteDos.getDomicilioConfirmado());
        System.out.println(clienteUno.getCorreo());
        System.out.println(clienteDos.getCorreo());
        System.out.println(clienteUno.getOcasion());
        System.out.println(clienteDos.getOcasion());
        System.out.println(clienteUno.getPresupuesto());
        System.out.println(clienteDos.getPresupuesto());
        System.out.println(clienteUno.getMensajeTarjeta());
        System.out.println(clienteDos.getMensajeTarjeta());

        Flor florUno = new Flor();
        Flor florDos = new Flor(
                1,
                "rosa",
                "azul",
                36.05,
                "25 dias",
                "terrestre",
                25,
                "100 mil",
                "Buena",
                "2 meses");

        System.out.println(florUno.getId());
        System.out.println(florDos.getId());
        System.out.println(florUno.getNombre());
        System.out.println(florDos.getNombre());
        System.out.println(florUno.getColor());
        System.out.println(florDos.getColor());
        System.out.println(florUno.getTamaño());
        System.out.println(florDos.getTamaño());
        System.out.println(florUno.getDuracion());
        System.out.println(florDos.getDuracion());
        System.out.println(florUno.getHabitat());
        System.out.println(florDos.getHabitat());
        System.out.println(florUno.getNumeroPetalos());
        System.out.println(florDos.getNumeroPetalos());
        System.out.println(florUno.getPrecio());
        System.out.println(florDos.getPrecio());
        System.out.println(florUno.getFragancia());
        System.out.println(florDos.getFragancia());
        System.out.println(florUno.getTiempoCrecimiento());
        System.out.println(florDos.getTiempoCrecimiento());

        Proveedor proveedorUno=new Proveedor();
        Proveedor proveedorDos=new Proveedor(87543,
                "jose",
                "sanin",
                "09854763",
                "23829839283",
                "@gmail.com",
                "calle 2",
                20000.00,
                "tecnico en floristeria",
                "Las que sea");

        System.out.println(proveedorUno.getId());
        System.out.println(proveedorDos.getId());
        System.out.println(proveedorUno.getNombre());
        System.out.println(proveedorDos.getNombre());
        System.out.println(proveedorUno.getApellido());
        System.out.println(proveedorDos.getApellido());
        System.out.println(proveedorUno.getCedula());
        System.out.println(proveedorDos.getCedula());
        System.out.println(proveedorUno.getTelefono());
        System.out.println(proveedorDos.getTelefono());
        System.out.println(proveedorUno.getCorreo());
        System.out.println(proveedorDos.getCorreo());
        System.out.println(proveedorUno.getDireccion());
        System.out.println(proveedorDos.getDireccion());
        System.out.println(proveedorUno.getTarifas());
        System.out.println(proveedorDos.getTarifas());
        System.out.println(proveedorUno.getCertificaciones());
        System.out.println(proveedorDos.getCertificaciones());
        System.out.println(proveedorUno.getCondicionesPago());
        System.out.println(proveedorDos.getCondicionesPago());

        Repartidor repartidorUno=new Repartidor();
        Repartidor repartidorDos=new Repartidor(
                23,
                "Alejo",
                "Gil",
                "237824795",
                "284928749",
                25,
                "cale 20",
                LocalDate.now(),
                "ZZY89E",
                100000.00);

        System.out.println(repartidorUno.getId());
        System.out.println(repartidorDos.getId());
        System.out.println(repartidorUno.getNombre());
        System.out.println(repartidorDos.getNombre());
        System.out.println(repartidorUno.getApellido());
        System.out.println(repartidorDos.getApellido());
        System.out.println(repartidorUno.getCedula());
        System.out.println(repartidorDos.getCedula());
        System.out.println(repartidorUno.getTelefono());
        System.out.println(repartidorDos.getTelefono());
        System.out.println(repartidorUno.getNumeroPedidos());
        System.out.println(repartidorDos.getNumeroPedidos());
        System.out.println(repartidorUno.getDireccionPedido());
        System.out.println(repartidorDos.getDireccionPedido());
        System.out.println(repartidorUno.getFechaEntrega());
        System.out.println(repartidorDos.getFechaEntrega());
        System.out.println(repartidorUno.getPlaca());
        System.out.println(repartidorDos.getPlaca());
        System.out.println(repartidorUno.getPrecioPedido());
        System.out.println(repartidorDos.getPrecioPedido());















    }
}