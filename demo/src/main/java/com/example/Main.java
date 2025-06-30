package com.example;

import java.util.Scanner;

import com.example.builder.OrderBuilder;
import com.example.facade.VentaFacade;
import com.example.factory.ProductFactory;
import com.example.modelo.Pedido;
import com.example.modelo.Producto;
import com.example.observer.Inventario;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarObserver(producto ->
            System.out.println("Inventario actualizado para: " + producto.getNombre())
        );

        VentaFacade ventaFacade = new VentaFacade(inventario);
        Scanner scanner = new Scanner(System.in);
        OrderBuilder builder = new OrderBuilder();

        System.out.println("Bienvenido al sistema de ventas.");
        String opcion;
        do {
            System.out.print("Agregar producto (electronico/ropa): ");
            String tipo = scanner.nextLine();
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());

            Producto producto = ProductFactory.crearProducto(tipo, nombre, precio);
            builder.agregarProducto(producto);

            System.out.print("¿Agregar otro producto? (s/n): ");
            opcion = scanner.nextLine();
        } while (opcion.equalsIgnoreCase("s"));

        Pedido pedido = builder.build();
        ventaFacade.realizarVenta(pedido);
    }
}