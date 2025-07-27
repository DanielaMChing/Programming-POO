/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteisaac;

/**
 *
 * @author romer
 */
public class Transaccion {
    private String tipo;
    private double monto;
    private String descripcion;
    
    public Transaccion(String tipo, double monto, String descripcion){
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        
    }
    public String getTipo(){
        return tipo;
    }
    public double getMonto(){
        return monto;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    public String toString(){
        return tipo + " de ₡" + monto + " - " + descripcion;
    }
}
