package com.example.observer;

import com.example.modelo.Producto;

public interface InventarioObserver {
    void actualizar(Producto producto);
}