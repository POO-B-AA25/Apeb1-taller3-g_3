public class EjecutorTerreno {
    public static Terreno terreno1 = new Terreno();
    public static Terreno terreno2;
    
    public static void main(String[] args) {
        terreno1 = new Terreno();
    
        terreno2 = new Terreno(3, 3, 4);
        terreno2.calcularArea();
        terreno2.calcularCostoTerreno();
        System.out.println(terreno2);
    }
}

class Terreno{
    public double ancho;
    public double largo;
    public double valorMetroCuadrado;
    public double area;
    public double costoTerreno;
    public Terreno() { 
    } 
    public Terreno(double ancho, double largo, double valorMetro) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetro; 
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;  
    } 
    public void setLargo(double largo) {
        this.largo = largo; 
    } 
    public void setValorMetro(double valorMetro) {
        this.valorMetroCuadrado = valorMetro;  
    } 
    public double getAncho() {
        return ancho;  
    } 
    public double getLargo() {
        return largo;  
    } 
    public double getValorMetro() {
        return valorMetroCuadrado; 
    } 
    public double getArea() {
        return area; 
    } 
    public double getCostoTerreno() {
        return costoTerreno; 
    }
    public void calcularArea(){
        this.area = this.ancho * this.largo;
    }
    public void calcularCostoTerreno(){
        this.costoTerreno = this.area * this.valorMetroCuadrado;
    }
    @Override
    public String toString() {
        return String.format("Terreno%s%.2f %s%.2f %s%.2f %s%.2f %s%.2f",
                                      "\nancho = ", this.getAncho(),
                                      "\nlargo = ", this.getLargo(),
                                      "\nvalorMetroCuadrado = ", this.getValorMetro(),
                                      "\narea = ", this.getArea(),
                                      "\ncostoTerreno = ", this.getCostoTerreno());
    }
}