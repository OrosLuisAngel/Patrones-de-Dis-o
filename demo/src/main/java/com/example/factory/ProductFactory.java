package com.example.factory;

import com.example.modelo.Producto;
import com.example.modelo.ProductoElectronico;
import com.example.modelo.ProductoRopa;

public class ProductFactory {
    public static Producto crearProducto(String tipo, String nombre, double precio) {
        switch (tipo.toLowerCase()) {
            case "electronico":
                return new ProductoElectronico(nombre, precio);
            case "ropa":
                return new ProductoRopa(nombre, precio);
            default:
                throw new IllegalArgumentException("Eliga pls uno de los 2 tipos de producto: electronico o ropa");
        }
    }
}