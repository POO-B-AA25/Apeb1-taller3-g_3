public class EjecutorEquipoCelular {

    public static EquipoCelular equipoCelular1 = new EquipoCelular();
    public static EquipoCelular equipoCelular2;

    public static void main(String[] args) {
        equipoCelular1 = new EquipoCelular();

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
        return String.format("EquipoCelular\nSistemaOperativo = %s\n"
                + "tamanioPantalla = %.2f\ncostoInicial = %.2f\niva = %.2f\n"
                + "costoInicialIva = %.2f, costoFinal = %.2f\n"
                + "direccionMac = %s\nimei = %s ",
                             sistemaOperativo, tamanioPantalla, costoInicial, 
                             iva, costoInicialIva, costoFinal, direccionMac, imei);
    }
}