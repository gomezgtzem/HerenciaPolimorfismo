package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {

        Ave ave = new Ave();
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();
        ave.ponerHuevo();
        ave.respirar();

        Perro perro = new Perro("Pulgas");
        perro.jugar();
        perro.comer();
        perro.respirar();

//        Animal animal = new Animal();
//        animal.comer();
//        animal.comunicarse();
    }
}
