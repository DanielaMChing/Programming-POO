import javax.swing.JOptionPane;

public class Usuario {

    private int numeroCuenta;
    private int pin;
    private String nombre;
    private String apellido;

    public Usuario(int numeroCuenta, int pin, String nombre, String apellido) {
        this.numeroCuenta = numeroCuenta;
        this.pin = pin;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getPin() {
        return pin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Método adicional para mostrar la información del usuario
    public void mostrarInformacion() {
        String mensaje = "Nombre: " + nombre + " " + apellido +
                         "\nNúmero de cuenta: " + numeroCuenta;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Usuario", JOptionPane.INFORMATION_MESSAGE);
    }
}


