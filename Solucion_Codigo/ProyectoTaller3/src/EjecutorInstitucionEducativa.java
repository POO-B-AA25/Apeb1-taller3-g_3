public class EjecutorInstitucionEducativa {
    public static InstitucionEducativa institucionEducativa1 = new InstitucionEducativa();
    public static InstitucionEducativa institucionEducativa2;

    public static void main(String[] args) {
        institucionEducativa1 = new InstitucionEducativa();
        institucionEducativa1.setNombre("Unidad Educativa Bernardo Valdivieso");
        institucionEducativa1.setTipoInstitucion("Publico");
        institucionEducativa1.setNumAlumnos(1856);
        institucionEducativa1.setNumDocentes(52);
        institucionEducativa1.setNumSedes(1);
        institucionEducativa1.setGastosEstudiante(6.00);
        institucionEducativa1.calcularPresupuesto();
        System.out.println(institucionEducativa1);

        institucionEducativa2 = new InstitucionEducativa();
        institucionEducativa2.setNombre("Unidad Educativa Daniel Alvarez Burneo");
        institucionEducativa2.setTipoInstitucion("Fiscomisional");
        institucionEducativa2.setNumAlumnos(1577);
        institucionEducativa2.setNumDocentes(48);
        institucionEducativa2.setNumSedes(1);
        institucionEducativa2.setGastosEstudiante(50.00);
        institucionEducativa2.calcularPresupuesto();
        System.out.println(institucionEducativa2);
    }
}

class InstitucionEducativa {
    public String nombre;
    public String tipoInstitucion;
    public int numAlumnos;
    public int numDocentes;
    public int numSedes;
    public double gastosEstudiante;
    public double presupuesto;

    public InstitucionEducativa() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public void setNumDocentes(int numDocentes) {
        this.numDocentes = numDocentes;
    }

    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }

    public void setGastosEstudiante(double gastosEstudiante) {
        this.gastosEstudiante = gastosEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void calcularPresupuesto() {
        this.presupuesto = this.numAlumnos * this.gastosEstudiante;
    }

    @Override
    public String toString() {
        return String.format("InstitucionEducativa { nombre = %s, tipoInstitucion = %s, numAlumnos = %d, numDocentes = %d, numSedes = %d, gastosEstudiante = %.2f, presupuesto = %.2f }",
                             nombre, tipoInstitucion, numAlumnos, numDocentes, numSedes, gastosEstudiante, presupuesto);
    }
}