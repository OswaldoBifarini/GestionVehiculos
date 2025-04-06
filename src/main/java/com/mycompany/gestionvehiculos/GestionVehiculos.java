package com.mycompany.gestionvehiculos;

/*GRUPO 1
INTEGRANTES : Jirleidy Santos, William Caizaguano, Josue Guerreo.
ASIGNATURA: Estructura de Datos
 */
class Vehiculo {

    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}

class Automovil extends Vehiculo {

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

class Motocicleta extends Vehiculo {

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

public class GestionVehiculos {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Toyota", "Fortuner", 2023, 4);
        Motocicleta moto1 = new Motocicleta("KTM", "Duke 390cc", 2024, "Sport-Street");

        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = auto1;
        vehiculos[1] = moto1;

        for (int i = 0; i < 2; i++) {
            vehiculos[i].mostrarInfo();
        }
    }
}
