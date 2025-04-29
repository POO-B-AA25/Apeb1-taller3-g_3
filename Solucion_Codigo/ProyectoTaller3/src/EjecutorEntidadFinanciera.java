public class EjecutorEntidadFinanciera {
    
    public static void main(String[] args) {
        double valorCheque = (Math.random() * 900);
        
        Cheques cheque1 = new Cheques();
        
        Cheques cheque2 = new Cheques("Valentina Perez", "Banco de Loja", valorCheque);
         System.out.println(cheque2);
    }

}
class Cheques {

    public String nombreCliente;
    public String nombreBanco;
    public double valorCheque;
    public double comision;

    public Cheques() {

    }

    public Cheques(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        calcularCoomisionBanco();
    }

    public void calcularCoomisionBanco() {
        this.comision = valorCheque * 0.003;
    }

    public String toString() {
        return String.format("EntidadFinanciera\nnombreCliente = %s\n"
                + "nombreBanco = %s\n"
                + "valorCheque = %.2f\n"
                + "comision = %.2f",
                nombreCliente, nombreBanco, valorCheque, comision);
    }
}
