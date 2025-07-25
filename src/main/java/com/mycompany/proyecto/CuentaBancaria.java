/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import javax.swing.JOptionPane;
/**
 *
 * @author mdani
 */

public class CuentaBancaria {
    private Usuario usuario;
    private double saldo;
    private TipoDeCuenta tipo;  // ← este era el error

    public CuentaBancaria(Usuario usuario, TipoDeCuenta tipo) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.saldo = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoDeCuenta getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }
}


