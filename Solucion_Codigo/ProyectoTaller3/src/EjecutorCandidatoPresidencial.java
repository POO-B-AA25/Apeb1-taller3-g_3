
public class EjecutorCandidatoPresidencial {
    
    public static void main(String[] args) {

        CandidatoPresidencial candidato1 = new CandidatoPresidencial();

        CandidatoPresidencial candidato2 = new CandidatoPresidencial("Luisa "
                + "Magdalena Gonzalez Alcivar", "Movimiento "
                        + "Revolucion Ciudadana");
        System.out.println(candidato2);

        CandidatoPresidencial candidato3 = new CandidatoPresidencial(
            "Daniel Roy Gilchrist Noboa Azin", 37,
            "Accion Democratica Nacional",
            "Reconstruyendo Ecuador", 100
        );
        System.out.println(candidato3);
    }
}

class CandidatoPresidencial {

    public String nombre;
    public int edad;
    public String partidoPolitico;
    public String planGobierno;
    public int numPropuestas;
    public boolean edadMinima;

    public CandidatoPresidencial() {
        this.nombre = "No definido";
        this.edad = 0;
        this.partidoPolitico = "Independiente";
        this.planGobierno = "No definido";
        this.numPropuestas = 0;
        this.determinarEdadMinima();
    }

    public CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.edad = 0;
        this.planGobierno = "No definido";
        this.numPropuestas = 0;
        this.determinarEdadMinima();
    }

    public CandidatoPresidencial(String nombre, int edad, String partidoPolitico, String planGobierno, int numPropuestas) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numPropuestas = numPropuestas;
        this.determinarEdadMinima();
    }

    public void determinarEdadMinima() {
        this.edadMinima = this.edad >= 35;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public int getNumPropuestas() {
        return numPropuestas;
    }

    public String getEdadMinima() {
        return edadMinima ? "si" : "no";
    }

    @Override
    public String toString() {
        return String.format(
            "Candidato\n" +
            "nombre = %s\n" +
            "edad = %d\n" +
            "partidoPolitico = %s\n" +
            "planGobierno = %s\n" +
            "numPropuestas = %d\n" +
            "edadMinima = %s\n",
            nombre, edad, partidoPolitico, planGobierno, numPropuestas, getEdadMinima()
        );
    }
}


