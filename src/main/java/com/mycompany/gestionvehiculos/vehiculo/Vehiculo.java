/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos.vehiculo;

/**
 *
 * @author DELL
 */
public class Vehiculo {
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
