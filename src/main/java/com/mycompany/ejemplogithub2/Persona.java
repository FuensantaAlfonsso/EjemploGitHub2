/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplogithub2;

/**
 *
 * @author Home
 */
public class Persona {
 
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        edad++;
        edad--;
        this.edad = edad;
    }

    // Método para que la persona conduzca un coche
    public void conducirCoche(Coche coche) {
        System.out.println(nombre + " está conduciendo el coche " + coche.getMarca());
        coche.arrancar();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    //Los nombres siempre en mayúsculas
    public void setNombre(String nombre) {
        nombre = nombre.toUpperCase();
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
    

