import javax.swing.JOptionPane;

public class RegistroUsuario {

    public static void main(String[] args) {

        // Crear 3 usuarios
        Usuario tarjeta1 = new Usuario(1055, 1234, "Alondra", "Matamoros");
        Usuario tarjeta2 = new Usuario(2044, 5678, "Carlos", "Ramírez");
        Usuario tarjeta3 = new Usuario(3099, 9012, "María", "Soto");

        // Arreglo para buscar usuarios fácilmente
        Usuario[] usuarios = { tarjeta1, tarjeta2, tarjeta3 };

        // Solicitar datos de acceso con JOptionPane
        String cuentaTexto = JOptionPane.showInputDialog("Ingrese su número de cuenta:");
        int cuentaIngresada = Integer.parseInt(cuentaTexto);

        String pinTexto = JOptionPane.showInputDialog("Ingrese su PIN:");
        int pinIngresado = Integer.parseInt(pinTexto);

        boolean accesoPermitido = false;

        // Buscar si hay coincidencia
        for (Usuario u : usuarios) {
            if (u.getNumeroCuenta() == cuentaIngresada && u.getPin() == pinIngresado) {
                accesoPermitido = true;

                // Mostrar bienvenida
                String mensaje = "Bienvenido/a, " + u.getNombre() + " " + u.getApellido()
                        + "\nNúmero de cuenta: " + u.getNumeroCuenta();
                JOptionPane.showMessageDialog(null, mensaje);

                // Menú básico usando JOptionPane
                String opcionTexto = JOptionPane.showInputDialog(
                    "Seleccione la opción que desea gestionar:\n"
                    + "1. Cuenta de débito\n"
                    + "2. Cuenta de crédito\n"
                    + "3. Ahorro a plazo"
                );

                int opcion = Integer.parseInt(opcionTexto);

                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Accedió a su cuenta de débito.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Accedió a su cuenta de crédito.");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Accedió a su ahorro a plazo.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida.");
                }

                break;
            }
        }

        if (!accesoPermitido) {
            JOptionPane.showMessageDialog(null, "Número de cuenta o PIN incorrecto.");
        }

    }
}