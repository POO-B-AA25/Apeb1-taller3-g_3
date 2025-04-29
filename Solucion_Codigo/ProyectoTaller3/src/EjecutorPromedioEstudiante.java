import java.util.Random;

public class EjecutorPromedioEstudiante {
    public static void main(String[] args) {
        Random rand = new Random();
        
        PromedioEstudiante estudiante1 = new PromedioEstudiante();
        
        PromedioEstudiante estudiante2 = new PromedioEstudiante();
        estudiante2.setNombreEstudiante("Carlos Rodriguez");
        estudiante2.setCalificacionNota1(rand.nextDouble() * 10);
        estudiante2.setCalificacionNota2(rand.nextDouble() * 10);
        estudiante2.setCalificacionNota3(rand.nextDouble() * 10);
        estudiante2.calcularPromedio();
        estudiante2.determinarEstado();
        System.out.println(estudiante2);
    }
}

class PromedioEstudiante {
    public String nombreEstudiante;
    public double calificacionNota1;
    public double calificacionNota2;
    public double calificacionNota3;
    public double promedioCalificaciones;
    public String estado;

    public PromedioEstudiante() {
    }

    public PromedioEstudiante(String nombreEstudiante, double calificacionNota1,
            double calificacionNota2, double calificacionNota3) {
        this.nombreEstudiante = nombreEstudiante;
        this.calificacionNota1 = calificacionNota1;
        this.calificacionNota2 = calificacionNota2;
        this.calificacionNota3 = calificacionNota3;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setCalificacionNota1(double calificacionNota1) {
        this.calificacionNota1 = calificacionNota1;
    }

    public void setCalificacionNota2(double calificacionNota2) {
        this.calificacionNota2 = calificacionNota2;
    }

    public void setCalificacionNota3(double calificacionNota3) {
        this.calificacionNota3 = calificacionNota3;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public double getCalificacionNota1() {
        return calificacionNota1;
    }

    public double getCalificacionNota2() {
        return calificacionNota2;
    }

    public double getCalificacionNota3() {
        return calificacionNota3;
    }

    public double getPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void calcularPromedio() {
        promedioCalificaciones = (calificacionNota1 + calificacionNota2 + 
                calificacionNota3) / 3;
    }

    public void determinarEstado() {
        if (promedioCalificaciones >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    @Override
    public String toString() {
        return String.format("PromedioEstudiante\n"
                + "nombreEstudiante = %s\ncalificacionNota1 = %.2f"
                + "\ncalificacionNota2 = %.2f\ncalificacionNota3 = %.2f\n"
                + "promedioCalificaciones = %.2f\nestado = %s",
                              nombreEstudiante, calificacionNota1, 
                              calificacionNota2, calificacionNota3, 
                              promedioCalificaciones, estado);
    }
}