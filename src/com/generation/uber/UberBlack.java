package com.generation.uber;

public class UberBlack extends UberDriver{
    private int minimo = 10;
    private double distanciaPorKm = 2;

    @Override
    public void calcularPrecio(double km) {
        this.minimo = minimo;
        this.distanciaPorKm = distanciaPorKm;
        if (km < 7) {
            System.out.println(Math.max(distanciaPorKm * minimo, minimo));
        } else {
            System.out.println(Math.max(distanciaPorKm * km, km));
        }
    }
}
