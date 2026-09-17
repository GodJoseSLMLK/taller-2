public class DepositoAgua {
    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    // Constructor vacío: inicializa con valores seguros
    public DepositoAgua() {
        this.capacidad = 0;
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }

    // Constructor con capacidad: el volumenActual inicia en 0 y depositoDesborde en null
    public DepositoAgua(double capacidad) {
        this.capacidad = capacidad;
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }

    // Constructor completo: recibe capacidad y volumenActual
    public DepositoAgua(double capacidad, double volumenActual) {
        this.capacidad = capacidad;
        this.volumenActual = volumenActual;
        this.depositoDesborde = null;
    }

    // Getters y setters
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(double volumenActual) {
        this.volumenActual = volumenActual;
    }

    public DepositoAgua getDepositoDesborde() {
        return depositoDesborde;
    }

    // depositoDesborde se conecta con un setter, no por constructor,
    // porque el objeto al que apunta se crea por separado.
    public void setDepositoDesborde(DepositoAgua depositoDesborde) {
        this.depositoDesborde = depositoDesborde;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Capacidad: " + capacidad + " | Volumen actual: " + volumenActual);
    }

    public void agregarAgua(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        double espacioDisponible = capacidad - volumenActual;

        if (cantidad <= espacioDisponible) {
            volumenActual += cantidad;
            System.out.println("Se agregaron " + cantidad + " litros. Volumen actual: " + volumenActual);
        } else {
            double excedente = cantidad - espacioDisponible;
            volumenActual = capacidad;
            System.out.println("Depósito lleno. Volumen actual: " + volumenActual);

            if (depositoDesborde != null) {
                System.out.println("Desbordando " + excedente + " litros al depósito de desborde.");
                depositoDesborde.agregarAgua(excedente);
            } else {
                System.out.println("Se pierden " + excedente + " litros: no hay depósito de desborde configurado.");
            }
        }
    }
}