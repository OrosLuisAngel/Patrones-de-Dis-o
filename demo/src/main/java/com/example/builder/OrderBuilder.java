package com.example.builder;

import com.example.modelo.Pedido;
import com.example.modelo.Producto;
import java.util.ArrayList;
import java.util.List;


public class OrderBuilder {
    private List<Producto> productos = new ArrayList<>();

    public OrderBuilder agregarProducto(Producto producto) {
        productos.add(producto);
        return this;
    }

    public Pedido build() {
        return new Pedido(productos);
    }
}