/*
DANIELA
 */
package com.mycompany.proyecto;

import javax.swing.JOptionPane;

//Esta parte es solamente el menu
        for (int i = 0; i < cantidadUsuarios; i++) {
            Usuario_Registrado u = usuarios[i];
            if (u.getNumeroCuenta() == cuentaIngresada && u.getPin() == pinIngresado) {
                accesoPermitido = true;

                String mensaje = "Bienvenido/a, " + u.getNombre() + " " + u.getApellido()
                        + "\nNúmero de cuenta: " + u.getNumeroCuenta();

                if (u.getCedula() != null && u.getCorreo() != null) {
                    mensaje += "\nCédula: " + u.getCedula();
                    mensaje += "\nCorreo: " + u.getCorreo();
                }

                JOptionPane.showMessageDialog(null, mensaje);

                Cuenta cuenta = new Cuenta();

                while (true) {
                    String opcionTexto = JOptionPane.showInputDialog(
                        " = Escriba la opción que desea gestionar = \n"
                        + "1. Movimientos y transacciones\n"
                        + "2. Saldos y Cálculos\n"
                        + "3. Ahorro a plazo\n"
                        + "4. Salir de la cuenta\n"
                    );

                    if (opcionTexto == null || opcionTexto.equals("4")) {
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema bancario...");
                        break;
                    }

                    int opcion = Integer.parseInt(opcionTexto);

                    switch (opcion) {
                        case 1:
                            while (true) {
                                String menu = JOptionPane.showInputDialog(
                                    "== MOVIMIENTOS Y TRANSACCIONES ==\n"
                                    + "1. Registrar débito\n"
                                    + "2. Registrar crédito\n"
                                    + "3. Ver historial\n"
                                    + "4. Volver\n"
                                    + "*Movimientos y transacciones está ligado a Saldos y cálculos*\n"                                
                                );

                                if (menu == null || menu.equals("4")) {
                                    break;
                                }

                                if (menu.equals("1")) {
                                    String montoTxt = JOptionPane.showInputDialog("Ingrese el monto a debitar:");
                                    String desc = JOptionPane.showInputDialog("Descripción del débito:");
                                    if (montoTxt != null && desc != null) {
                                        double monto = Double.parseDouble(montoTxt);
                                        cuenta.registrarDebito(monto, desc);
                                    }
                                } else if (menu.equals("2")) {
                                    String montoTxt = JOptionPane.showInputDialog("Ingrese el MONTO a acreditar:");
                                    String desc = JOptionPane.showInputDialog("DESCRIPCIÓN del crédito:");
                                    if (montoTxt != null && desc != null) {
                                        double monto = Double.parseDouble(montoTxt);
                                        cuenta.registrarCredito(monto, desc);
                                    }
                                } else if (menu.equals("3")) {
                                    cuenta.verHistorial();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                                }
                            }
                            break;

                        case 2:
                            while (true) {
                                String menu2 = JOptionPane.showInputDialog(
                                    "== SALDO Y CÁLCULOS ==\n"         
                                    + "1. Ver saldo disponible\n"
                                    + "2. Actualizar Saldo\n"
                                    + "3. Ver historial\n"                                              
                                    + "4. Volver\n"                                          
                                    + "*Saldos y cálculos está ligado a Movimientos y transacciones*\n"                                        
                                );

                                if (menu2 == null || menu2.equals("4")) {
                                break;
                                }
                                if (menu2.equals("1")){
                                    double saldoActual = cuenta.getSaldo();
                                    String nombre = u.getNombre();

                                JOptionPane.showMessageDialog(null,
                                    "Estimado/a " + nombre + ",\nSu saldo actual es de: ₡" + String.format("%.2f", saldoActual),
                                    "Saldo Disponible", JOptionPane.INFORMATION_MESSAGE);                                    
                                } 
                            else if (menu2.equals("2")){
                                double saldoActual = cuenta.getSaldo();
                                String nombreUsuario = u.getNombre();
                                
                                String montoTexto = JOptionPane.showInputDialog("Ingrese el monto a depositar");
                                String descripcion = JOptionPane.showInputDialog("Descripción del deposito");

                                if (montoTexto != null && descripcion != null) {
                                    double monto = Double.parseDouble(montoTexto);
                                    saldoActual = ActualizarSaldo.realizarDeposito(saldoActual, monto, descripcion);
                                    cuenta.registrarCredito(monto, descripcion);
                                }
                            }
                            else if (menu2.equals("3")){
                                cuenta.verHistorial();
                            }else {
                                JOptionPane.showMessageDialog(null, "Opción inválida.");
                            }                                
                            }
                            break;

                            
                        case 3:
                            while (true) {
                                String menu3 = JOptionPane.showInputDialog(
                                    "== AHORRO A PLAZO ==\n"
                                    + "1. Controlar saldo\n"
                                    + "2. Volver\n"
                                );

                                if (menu3 == null || menu3.equals("2")) {
                                    break;
                                }

                                if (menu3.equals("1")) {
                                    String montoTxt = JOptionPane.showInputDialog("Monto a ahorrar:");
                                    String mesesTxt = JOptionPane.showInputDialog("Cantidad de meses:");
                                    String tasaTxt = JOptionPane.showInputDialog("Tasa mensual (ej: 0.01 para 1%)");

                                    if (montoTxt != null && mesesTxt != null && tasaTxt != null) {
                                        double monto = Double.parseDouble(montoTxt);
                                        int meses = Integer.parseInt(mesesTxt);
                                        double tasa = Double.parseDouble(tasaTxt);

                                        AhorrosPlaza ahorro = new AhorrosPlaza(monto, meses, tasa);
                                        ahorro.mostrarResumen();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Opción inválida");
                                }
                            }
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida.");
                            break;
                    }
                }

                break;
            }
        }

        if (!accesoPermitido) {
            JOptionPane.showMessageDialog(null, "Número de cuenta o PIN incorrecto.");
        }
    }