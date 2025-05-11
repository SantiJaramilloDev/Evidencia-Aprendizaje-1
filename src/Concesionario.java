import java.util.List;
import java.util.ArrayList;

public class Concesionario {
    private List<Vehiculo> inventario = new ArrayList<>(); // Lista de vehículos disponibles
    private List<Venta> ventas = new ArrayList<>(); // Lista de ventas realizadas

    public void agregarVehiculo(Vehiculo vehiculo) {
        inventario.add(vehiculo);
    }

    public void realizarVenta(String codigoVehiculo, double monto, String apellido, String nombre, String documento) {
        Vehiculo vehiculoVendido = null;
        for (Vehiculo v : inventario) {
            if (v.getCodigo().equals(codigoVehiculo)) {
                vehiculoVendido = v;
                break;
            }
        }
        if (vehiculoVendido != null) {
            ventas.add(new Venta(monto, vehiculoVendido, apellido, nombre, documento));
            inventario.remove(vehiculoVendido);
            System.out.println("Venta realizada: " + nombre + " " + apellido + " ha comprado " + vehiculoVendido.getMarca());
        } else {
            System.out.println("Error: Vehículo con código " + codigoVehiculo + " no encontrado.");
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Vehiculo v : inventario) {
            System.out.println(v);
        }
    }

    public void mostrarVentas() {
        System.out.println("Ventas realizadas:");
        for (Venta v : ventas) {
            System.out.println(v);
        }
    }
}