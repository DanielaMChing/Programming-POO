/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteisaac;
import javax.swing.JOptionPane;

public class Cuenta {
    private double saldo;
    private String ultimaTransaccion; // solo guarda la última

    public Cuenta() {
        this.saldo = 0;
        this.ultimaTransaccion = "Sin transacciones aún.";
    }

    public void registrarCredito(double monto, String descripcion) {
        saldo += monto;
        ultimaTransaccion = "Crédito de ₡" + monto + " - " + descripcion;
        JOptionPane.showMessageDialog(null,
                "Crédito registrado:\nMonto: ₡" + monto + "\nDescripción: " + descripcion,
                "Crédito", JOptionPane.INFORMATION_MESSAGE);
    }

    public void registrarDebito(double monto, String descripcion) {
        if (monto <= saldo) {
            saldo -= monto;
            ultimaTransaccion = "Débito de ₡" + monto + " - " + descripcion;
            JOptionPane.showMessageDialog(null,
                    "Débito registrado:\nMonto: ₡" + monto + "\nDescripción: " + descripcion,
                    "Débito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Fondos insuficientes para realizar el débito.",
                    "Error de saldo", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void verHistorial() {
        JOptionPane.showMessageDialog(null,
                " Última transacción:\n" + ultimaTransaccion + "\n\n Saldo actual: ₡" + saldo,
                "Resumen de cuenta", JOptionPane.INFORMATION_MESSAGE);
    }

    public double getSaldo() {
        return saldo;
    }
}
