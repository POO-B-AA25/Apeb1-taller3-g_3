public class EjecutorAutomovil {
    public static void main(String[] args) {
        
        Automovil auto1 = new Automovil(1100147275, "TOYOTA", 2020, 25000.00);
        auto1.calcularValorMatricula();
        System.out.println(auto1);
    }
}

class Automovil {
    public int cedulaDuenio;
    public String marcaVehiculo;
    public int anioFabrica;
    public double valorVehiculo;
    public double valorMatricula;

    public Automovil() {
    }

    public Automovil(int cedulaDuenio, String marcaVehiculo, int anioFabrica, double valorVehiculo) {
        this.cedulaDuenio = cedulaDuenio;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabrica = anioFabrica;
        this.valorVehiculo = valorVehiculo;
    }

    public void setCedulaDuenio(int cedulaDuenio) {
        this.cedulaDuenio = cedulaDuenio;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public void setAnioFabrica(int anioFabrica) {
        this.anioFabrica = anioFabrica;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public int getCedulaDuenio() {
        return cedulaDuenio;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int getAnioFabrica() {
        return anioFabrica;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        int anioActual = 2024;
        int antiguedad = anioActual - anioFabrica;
        valorMatricula = (valorVehiculo * 0.002) * antiguedad;
    }

    @Override
    public String toString() {
        return String.format("Automovil { cedulaDuenio = %d, marcaVehiculo = %s, anioFabrica = %d, valorVehiculo = %.2f, valorMatricula = %.2f }",
                              cedulaDuenio, marcaVehiculo, anioFabrica, valorVehiculo, valorMatricula);
    }
}