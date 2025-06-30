package com.example.facade;

import com.example.modelo.Pedido;
import com.example.modelo.Producto;
import com.example.observer.Inventario;

public class VentaFacade {
    private Inventario inventario;

    public VentaFacade(Inventario inventario) {
        this.inventario = inventario;
    }

    public void realizarVenta(Pedido pedido) {
        for (Producto producto : pedido.getProductos()) {
            inventario.notificar(producto);
        }
        System.out.println("Venta realizada. Total: $" + pedido.getTotal());
    }
}