package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Mascota;
import org.uniquindio.edu.co.poo.model.Veterinaria;

import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria("Amigos Peludos", "Calle 123 #45-67", "900123456-7");

        ArrayList<Mascota> pacientes = new ArrayList<>();

        Mascota m1 = new Mascota(1, "Firulais", "Perro", "Labrador", 5, "Marrón", 30.5);
        m1.agregarEnfermedad("Otitis");

        Mascota m2 = new Mascota(2, "Misu", "Gato", "Siames", 3, "Blanco", 4.2);

        pacientes.add(m1);
        pacientes.add(m2);

        System.out.println(vet);
        System.out.println("=== Pacientes registrados ===");
        for (Mascota mascota : pacientes) {
            System.out.println(mascota);
        }
    }
}