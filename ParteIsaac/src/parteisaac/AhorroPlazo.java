/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteisaac;

import javax.swing.JOptionPane;
public class AhorroPlazo {
    private double monto;
    private int meses;
    private double tasaInteres;
    
    public AhorroPlazo(double monto, int meses, double tasaInteres){
        this.monto = monto;
        this.meses = meses;
        this.tasaInteres = tasaInteres;
    }
    public double calcularInteres(){
        return monto * tasaInteres * meses;
    }
    public double montoFinal(){
        return monto + calcularInteres();
    }
    public void mostrarResumen(){
        String resumen = "Ahorro a plazo\n"
                + "---------------------\n"
                + "Monto inicial: " + monto + "\n"
                + "Meses: " + meses + "\n"
                + "Tasa de interés mensual: " + (tasaInteres * 100) + "%\n"
                + "Intereses generados: " + calcularInteres() + "\n"
                + "Monto final: " + montoFinal();
        JOptionPane.showMessageDialog(null, resumen, "Resumen de Ahorro a Plazo", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
