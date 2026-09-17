public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    // Constructor vacío: inicializa con valores seguros
    public Vuelo() {
        this.numero = "";
        this.origen = "";
        this.destino = "";
        this.ocupacion = 0;
        this.capacidadMaxima = 0;
    }

    // Constructor de ruta: recibe numero, origen y destino. La ocupación inicia en 0
    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = 0;
        this.capacidadMaxima = 0;
    }

    // Constructor completo: recibe numero, origen, destino, ocupacion y capacidadMaxima
    public Vuelo(String numero, String origen, String destino, int ocupacion, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = ocupacion;
        this.capacidadMaxima = capacidadMaxima;
    }

    // Getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(int ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Vuelo " + numero + " | Origen: " + origen + " | Destino: " + destino
                + " | Ocupación: " + ocupacion + "/" + capacidadMaxima);
    }

    public void embarcar() {
        if (ocupacion < capacidadMaxima) {
            ocupacion++;
            System.out.println("Pasajero embarcado en el vuelo " + numero + ". Ocupación actual: " + ocupacion);
        } else {
            System.out.println("No es posible embarcar, el vuelo " + numero + " está lleno.");
        }
    }

    public void desembarcar() {
        if (ocupacion > 0) {
            ocupacion--;
            System.out.println("Pasajero desembarcado del vuelo " + numero + ". Ocupación actual: " + ocupacion);
        } else {
            System.out.println("No hay pasajeros para desembarcar en el vuelo " + numero + ".");
        }
    }
}