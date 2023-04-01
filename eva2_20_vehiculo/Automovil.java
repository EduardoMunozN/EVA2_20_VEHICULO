/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_20_vehiculo;

/**
 *
 * @author eduar
 */
public class Automovil extends vehiculo implements ControlVelocidad{
    private int año;
  
    public Automovil() {
    }

    public Automovil(int año, int velocidad, String Marca, String modelo) {
        super(velocidad, Marca, modelo);
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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
        if(getVelocidad() > 0){
            System.out.println("La velocidad del auto es: "+getVelocidad());
        }else if(getVelocidad() <= 0){
            System.out.println("La velocidad del auto es 0 km/h");
        }
        System.out.println("El año del auto es: "+año);
        System.out.println("El modelo del auto es: "+modelo);
        System.out.println("La marca del auto es: "+Marca);
        
    }
    

    

   
    

    
    
    
}
