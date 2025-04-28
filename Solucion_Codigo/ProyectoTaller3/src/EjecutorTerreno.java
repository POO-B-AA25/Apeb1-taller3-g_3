public class EjecutorTerreno {
    public static Terreno terreno1 = new Terreno();
    public static Terreno terreno2;
    
    public static void main(String[] args) {
        terreno1 = new Terreno(2, 3, 4);
        terreno1.calcularArea();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1);
        
        terreno2 = new Terreno(3, 3, 4);
        terreno2.calcularArea();
        terreno2.calcularCostoTerreno();
        System.out.println(terreno2);
    }
}

class Terreno{
    public double ancho;
    public double largo;
    public double valorMetro;
    public double area;
    public double costoTerreno;
    public Terreno() { } 
    public Terreno(double ancho, double largo, double valorMetro) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetro = valorMetro; 
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;  
    } 
    public void setLargo(double largo) {
        this.largo = largo; 
    } 
    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;  
    } 
    public double getAncho() {
        return ancho;  
    } 
    public double getLargo() {
        return largo;  
    } 
    public double getValorMetro() {
        return valorMetro; 
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
        this.costoTerreno = this.area * this.valorMetro;
    }
    @Override
    public String toString() {
        return String.format("Terreno {%s%.2f %s%.2f %s%.2f %s%.2f %s%.2f}",
                                      "ancho = ", this.getAncho(),
                                      ", largo = ", this.getLargo(),
                                      ", valorMetro = ", this.getValorMetro(),
                                      ", area = ", this.getArea(),
                                      ", costoTerreno = ", this.getCostoTerreno());
    }
}