/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplogithub2;

/**
 *
 * @author Home
 */
public class EjemploGitHub2 {

     public static void main(String[] args) {
        // Crear una persona
        Persona persona = new Persona("Juan", 30);

        // Crear un coche
        Coche coche = new Coche("Toyota", "Corolla");

        // La persona conduce el coche
        persona.conducirCoche(coche);
    }
}
