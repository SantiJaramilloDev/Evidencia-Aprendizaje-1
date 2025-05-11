public class Vehiculo {
    private String codigo;
    private String marca;
    private String tipo;
    private int modelo;
    private double kilometraje;

    public Vehiculo(String codigo, String marca, String tipo, int modelo, double kilometraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "[Codigo: " + codigo + ", Marca: " + marca + ", Tipo: " + tipo + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje + "]";
    }
}

// Clases hijas

class Auto extends Vehiculo {
    public Auto(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Auto", modelo, kilometraje);
    }
}

class Camioneta extends Vehiculo {
    public Camioneta(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Camioneta", modelo, kilometraje);
    }
}

class Motocicleta extends Vehiculo {
    public Motocicleta(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Motocicleta", modelo, kilometraje);
    }
}