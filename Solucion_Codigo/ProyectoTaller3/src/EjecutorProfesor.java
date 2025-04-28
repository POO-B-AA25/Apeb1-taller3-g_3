public class EjecutorProfesor {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Alexis", "Ruiz", 450.00, "1120215386");
        profesor1.calcularIncremento();
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);

        Profesor profesor2 = new Profesor("Solange", "Vidal", 450.00, "1104994356");
        profesor2.calcularIncremento();
        profesor2.calcularSueldoTotal();
        System.out.println(profesor2);
    }
}

class Profesor {
    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public double incremento;
    public double sueldoTotal;
    public String cedula;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getIncremento() {
        return incremento;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public void calcularIncremento() {
        incremento = sueldoBasico * 0.20;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + incremento;
    }

    @Override
    public String toString() {
        return String.format("Profesor { nombre = %s, apellido = %s, sueldoBasico = %.2f, incremento = %.2f, sueldoTotal = %.2f, cedula = %s }",
                             nombre, apellido, sueldoBasico, incremento, sueldoTotal, cedula);
    }
}