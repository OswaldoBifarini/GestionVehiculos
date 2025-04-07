package com.mycompany.gestionvehiculos.automovil;

import com.mycompany.gestionvehiculos.vehiculo.Vehiculo;

public class Automovil extends Vehiculo {

    private int numPuertas;

    public Automovil(String marca, String modelo, int año, int numPuertas) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    public Automovil() {
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero Puertas: " + numPuertas);
    }
}
