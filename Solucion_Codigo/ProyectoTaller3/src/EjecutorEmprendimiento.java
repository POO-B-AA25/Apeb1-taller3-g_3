public class EjecutorEmprendimiento {
    public static Emprendimiento emprendimiento1 = new Emprendimiento();
    public static Emprendimiento emprendimiento2;

    public static void main(String[] args) {

        emprendimiento2 = new Emprendimiento(
            "Arsenia Restaurante",
            1108659784,
            "Gastronomía",
            "Juan Carlos Medina",
            "Av. Emiliano Ortega",
            "27/05/2011",
            10000.00
        );

        emprendimiento2.setCapitalinicial(450);
        emprendimiento2.calcularAntiguedad();
        emprendimiento2.calcularTamanioNegocio();

        System.out.println("Emprendimiento\n" + emprendimiento2.toString());
    }
}

class Emprendimiento {
    public String nombreComercial;
    public int ruc;
    public String sectorEconomico;
    public String propietario;
    public String ubicacion;
    public String fechaInicioActividades;
    public double capitalInicial;
    public int antiguedad;
    public String tipoNegocio;

    public Emprendimiento() {}

    public Emprendimiento(String nombreComercial, int ruc,
                          String sectorEconomico, String propietario,
                          String ubicacion, String fechaInicioActividades,
                          double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaInicioActividades = fechaInicioActividades;
        this.capitalInicial = capitalInicial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFechaInicioActividades(String fechaInicioActividades) {
        this.fechaInicioActividades = fechaInicioActividades;
    }

    public void setCapitalinicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public String getNombreComercial() {
        return this.nombreComercial;
    }

    public int getRuc() {
        return this.ruc;
    }

    public String getSectorEconomico() {
        return this.sectorEconomico;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public String getFechaInicioActividades() {
        return this.fechaInicioActividades;
    }

    public double getCapitalInicial() {
        return this.capitalInicial;
    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public String getTipoNegocio() {
        return this.tipoNegocio;
    }

    public void calcularAntiguedad() {
        int anioInicio = Integer.parseInt(this.fechaInicioActividades.substring(6));
        this.antiguedad = 2025 - anioInicio;
    }

    public void calcularTamanioNegocio() {
        if (this.capitalInicial < 100) {
            this.tipoNegocio = "pequeño";
        } else if (this.capitalInicial < 1000) {
            this.tipoNegocio = "mediano";
        } else {
            this.tipoNegocio = "grande";
        }
    }

    public String toString() {
        return "nombreComercial: " + this.getNombreComercial() + "\n" +
               "ruc: " + this.getRuc() + "\n" +
               "sectorEconomico: " + this.getSectorEconomico() + "\n" +
               "propietario: " + this.getPropietario() + "\n" +
               "ubicacion: " + this.getUbicacion() + "\n" +
               "fechaInicioActividades: " + this.getFechaInicioActividades() + "\n" +
               "capitalInicial: " + this.getCapitalInicial() + "\n" +
               "antiguedad: " + this.getAntiguedad() + "\n" +
               "tipoNegocio: " + this.getTipoNegocio();
    }
}
