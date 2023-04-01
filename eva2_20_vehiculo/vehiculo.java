/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_20_vehiculo;

/**
 *
 * @author eduar
 */
public class vehiculo {
    protected int velocidad;
    protected int detener;
    protected String Marca;
    protected String modelo;

    public vehiculo() {
    }

    public vehiculo(int velocidad, String Marca, String modelo) {
        this.velocidad = velocidad;
        this.Marca = Marca;
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getDetener() {
        return detener;
    }

    public void setDetener(int detener) {
        
        this.detener = detener;
    }
    
    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

    
    
    


    
    
    
}
