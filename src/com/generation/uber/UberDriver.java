package com.generation.uber;

public class UberDriver {

    private String nombre;
    private String modeloCarro;
    private String placa;
    private int minimo = 7;
    private double distanciaPorKm = 1.5;
    private int distanciaPorMin = 1;
    int salarioActualMensual = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public double getDistanciaPorKm() {
        return distanciaPorKm;
    }

    public void setDistanciaPorKm(double distanciaPorKm) {
        this.distanciaPorKm = distanciaPorKm;
    }

    public int getDistanciaPorMin() {
        return distanciaPorMin;
    }

    public void setDistanciaPorMin(int distanciaPorMin) {
        this.distanciaPorMin = distanciaPorMin;
    }

    public int getSalarioActualMensual() {
        return salarioActualMensual;
    }

    public void setSalarioActualMensual(int salarioActualMensual) {
        this.salarioActualMensual = salarioActualMensual;
    }

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


//class UberDriver{
//  String name;
//  String carModel;
//  String plate;
//  int minimum=7;
//  double ratePerKm = 1.5;
//  int ratePerMinute = 1;
//  int currentMonthSalary = 0;
//
//  double calculatePrice(double km) {
//    return Math.max(ratePerKm*km,7);
//  }