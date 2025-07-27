/*
DANIELA
 */
package com.mycompany.proyecto;

import javax.swing.JOptionPane;

public class ProyectoPOO {

    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "=== MENÚ PRINCIPAL ===\n" +
                "1. Gestión de Usuarios\n" +
                "2. Salir\n"
            );
            switch (opcion) {
                case "1":
                    menuClientes();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        }
    }

    static void menuClientes() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                " == BIENVENIDO AL SISTEMA BANCARIO ==\n" +
                "1. Iniciar sesión\n" +
                "2. Registrarse\n" +
                "3. Registros recientes\n" +                        
                "4. Salir"
            );

            switch (opcion) {
                case "1":
                    RegistroUsuario.iniciarSesion();
                    break;
                case "2":
                    RegistroUsuario.registrarUsuario();
                    break;
                case "3":
                    RegistroUsuario.mostrarUsuarios();                   
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        }
    }
}
