package com.mycompany.gestionvehiculos;

import com.mycompany.gestionvehiculos.automovil.Automovil;
import com.mycompany.gestionvehiculos.motocicleta.Motocicleta;
import com.mycompany.gestionvehiculos.vehiculo.Vehiculo;

/*GRUPO 1
INTEGRANTES : Jirleidy Santos, William Caizaguano, Josue Guerreo.
ASIGNATURA: Estructura de Datos
 */
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
