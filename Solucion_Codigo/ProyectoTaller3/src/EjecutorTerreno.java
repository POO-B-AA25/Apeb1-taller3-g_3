public class EjecutorTerreno {
    
}
 
class Terreno {
    public double ancho;
    public double largo;
    public double valorMetroCuadrado;
    public double area;
    public double costoTerreno;         

    public Terreno() {
    }
    public Terreno(double ancho, double largo, double valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double getAncho() {
        return ancho;
    }

    

    public double getLargo() {
        return largo;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double getArea() {
        return area;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setCostoTerreno(double costoTerreno) {
        this.costoTerreno = costoTerreno;
    }
    
    @Override
    public String toString() {
        return "Terreno{" + "ancho=" + ancho + ", largo=" + largo + ", valorMetroCuadrado=" + valorMetroCuadrado + ", area=" + area + ", costoTerreno=" + costoTerreno + '}';
    }
    
    
    
    
    
}


