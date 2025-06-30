package com.example.modelo;

import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private double total;

    public Pedido(List<Producto> productos) {
        this.productos = productos;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        double suma = 0;
        for (Producto p : productos) {
            suma += p.getPrecio();
        }
        return suma;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }
}