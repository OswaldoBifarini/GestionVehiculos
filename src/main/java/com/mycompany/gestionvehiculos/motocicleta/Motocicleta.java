package com.mycompany.gestionvehiculos.motocicleta;

import com.mycompany.gestionvehiculos.vehiculo.Vehiculo;

public class Motocicleta extends Vehiculo {

    private String tipo;

    public Motocicleta(String marca, String modelo, int año, String tipo) {
        super(marca, modelo, año);
        this.tipo = tipo;
    }

    public Motocicleta() {
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("Tipo: " + tipo);
    }

}
