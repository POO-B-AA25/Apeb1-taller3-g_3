public class EjecutorEquipoCelular {

    public static EquipoCelular equipoCelular1 = new EquipoCelular();
    public static EquipoCelular equipoCelular2;

    public static void main(String[] args) {
        equipoCelular1 = new EquipoCelular();
        equipoCelular1.setSistemaOperativo("iOS");
        equipoCelular1.setTamanioPantalla(6.2);
        equipoCelular1.setCostoInicial(1199.99);
        equipoCelular1.setIva(0.14);
        equipoCelular1.setCostoInicialIva(167.99);
        equipoCelular1.setDireccionMac("00:1C:4D:5E:6F:7A");
        equipoCelular1.setImei("356998071234567");
        equipoCelular1.calcularCostoFinal();
        System.out.println(equipoCelular1);

        equipoCelular2 = new EquipoCelular();
        equipoCelular2.setSistemaOperativo("Android");
        equipoCelular2.setTamanioPantalla(6.7);
        equipoCelular2.setCostoInicial(349.99);
        equipoCelular2.setIva(0.14);
        equipoCelular2.setCostoInicialIva(48.99);
        equipoCelular2.setDireccionMac("00:1B:3C:4D:5E:6F");
        equipoCelular2.setImei("865432071234567");
        equipoCelular2.calcularCostoFinal();
        System.out.println(equipoCelular2);
    }
}

class EquipoCelular {
    public String sistemaOperativo;
    public double tamanioPantalla;
    public double costoInicial;
    public double iva;
    public double costoInicialIva;
    public double costoFinal;
    public String direccionMac;
    public String imei;

    public EquipoCelular() {
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setCostoInicialIva(double costoInicialIva) {
        this.costoInicialIva = costoInicialIva;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void calcularCostoFinal() {
        this.costoFinal = this.costoInicial + this.costoInicialIva;
    }

    @Override
    public String toString() {
        return String.format("EquipoCelular { sistemaOperativo = %s, tamanioPantalla = %.2f, costoInicial = %.2f, iva = %.2f, costoInicialIva = %.2f, costoFinal = %.2f, direccionMac = %s, imei = %s }",
                             sistemaOperativo, tamanioPantalla, costoInicial, iva, costoInicialIva, costoFinal, direccionMac, imei);
    }
}