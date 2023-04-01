/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_20_vehiculo;

import java.sql.SQLOutput;

/**
 *
 * @author eduar
 */
public class Bicicleta extends vehiculo implements ControlVelocidad{
    private String tipodeBici;

    public Bicicleta() {
    }

    public Bicicleta(String tipodeBici, int velocidad, String Marca, String modelo) {
        super(velocidad, Marca, modelo);
        this.tipodeBici = tipodeBici;
    }
    
    

    public Bicicleta(String tipodeBici) {
        this.tipodeBici = tipodeBici;
    }

    public String getTipodeBici() {
        return tipodeBici;
    }

    public void setTipodeBici(String tipodeBici) {
        this.tipodeBici = tipodeBici;
    }

    @Override
    public int acelerar() {
        return getVelocidad();
    }

    @Override
    public int detener() {
        return getDetener();
    }

    @Override
    public void imprimirVelocidad() {
        System.out.println("El tipo de biccleta es:"+tipodeBici);
        System.out.println("La marca de la bicicleta es: "+ Marca);
        System.out.println("El modelo de la bicicleta es: "+modelo);
        if(getVelocidad() > 0){
            System.out.println("La velocidad de la bicicleta es: "+getVelocidad());
        }else if(getVelocidad() <= 0){
            System.out.println("La velocidad de la bicicleta es 0 km/h");
        }
        
    }

   
    
    
    
}
