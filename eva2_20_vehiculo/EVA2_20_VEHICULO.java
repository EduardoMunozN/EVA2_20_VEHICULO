/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_20_vehiculo;

/**
 *
 * @author eduar
 */
public class EVA2_20_VEHICULO {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil(2019, 0, "Ford", "Gt");
        auto1.imprimirVelocidad();
        
        
        Bicicleta bici = new Bicicleta("Montaña", 45,"BKR", "GTR");
        bici.imprimirVelocidad();
    }
}
