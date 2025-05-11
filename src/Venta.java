public class Venta {
    private double monto;
    private Vehiculo vehiculo;
    private String apellido;
    private String nombre;
    private String documento;

    public Venta(double monto, Vehiculo vehiculo, String apellido, String nombre, String documento) {
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Venta de " + vehiculo.toString() + " por $" + monto + " a " + nombre + " " + apellido + " (DNI: " + documento + ")";
    }
}