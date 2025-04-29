public class EjecutorEquivalenteHora {
    public static EquivalenteHora EquivalenteHora1 = new EquivalenteHora();
    public static EquivalenteHora EquivalenteHora2 = new EquivalenteHora();

    public static void main(String[] args) {

        EquivalenteHora1 = new EquivalenteHora();
        
        EquivalenteHora2 = new EquivalenteHora();
        EquivalenteHora2.horas = 32;
        EquivalenteHora2.minutos = calcularMinutos(EquivalenteHora2.horas);
        EquivalenteHora2.segundos = calcularSegundos(EquivalenteHora2.horas);
        EquivalenteHora2.dias = calcularDias(EquivalenteHora2.horas);

        System.out.println(EquivalenteHora2);
    }

    public static int calcularMinutos(int horas) {
        return horas * 60;
    }

    public static int calcularSegundos(int horas) {
        return horas * 3600;
    }

    public static double calcularDias(int horas) {
        return horas / 24.0;
    }
}

class EquivalenteHora {
    public int horas;
    public int minutos;
    public int segundos;
    public double dias;

    public EquivalenteHora() {
    }

    public EquivalenteHora(int horas, int minutos, int segundos, double dias) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.dias = dias;
    }

    @Override
    public String toString() {
        return String.format("EquivalenteHora\nhoras:%s\n"
                + "Minutos: %s\n"
                + "Segundos: %s\n"
                + "Dias: %.2f",
                horas, minutos, segundos, dias); 
    }
}