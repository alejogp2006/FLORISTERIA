package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos del cliente");

        System.out.print("Ingrese ID: ");
        Integer id = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("¿Domicilio Confirmado? (true/false): ");
        Boolean domicilioConfirmado = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Ingrese Correo: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese Ocasión: ");
        String ocasion = scanner.nextLine();

        System.out.print("Ingrese Presupuesto: ");
        Double presupuesto = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese Mensaje en Tarjeta: ");
        String mensajeTarjeta = scanner.nextLine();

        Cliente cliente = new Cliente(id, nombre, apellido, telefono,
                direccion, domicilioConfirmado, correo,
                ocasion, presupuesto, mensajeTarjeta);

        System.out.println("Ingrese los siguientes datos de la flor");

        System.out.print("Ingrese ID de la Flor: ");
        Integer idFlor = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese Nombre: ");
        String nombreFlor = scanner.nextLine();

        System.out.print("Ingrese Color: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese Tamaño: ");
        Double tamaño = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese Duración: ");
        String duracion = scanner.nextLine();

        System.out.print("Ingrese Hábitat: ");
        String habitat = scanner.nextLine();

        System.out.print("Ingrese Número de Pétalos: ");
        Integer numeroPetalos = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese Precio: ");
        String precio = scanner.nextLine();

        System.out.print("Ingrese Fragancia: ");
        String fragancia = scanner.nextLine();

        System.out.print("Ingrese Tiempo de Crecimiento: ");
        String tiempoCrecimiento = scanner.nextLine();

        // Crear el objeto Flor
        Flor flor = new Flor(idFlor, nombre, color, tamaño, duracion,
                habitat, numeroPetalos, precio,
                fragancia, tiempoCrecimiento);

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

        System.out.println(florUno.getIdFlor());
        System.out.println(florDos.getIdFlor());
        System.out.println(florUno.getNombreFlor());
        System.out.println(florDos.getNombreFlor());
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