package com.example.observer;

import java.util.ArrayList;
import java.util.List;

import com.example.modelo.Producto;

public class Inventario {
    private List<InventarioObserver> observers = new ArrayList<>();

    public void agregarObserver(InventarioObserver observer) {
        observers.add(observer);
    }

    public void notificar(Producto producto) {
        for (InventarioObserver obs : observers) {
            obs.actualizar(producto);
        }
    }
}