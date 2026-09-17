public class App {
    public static void main(String[] args) {

        System.out.println("===== Ejercicio 1: Libro =====");
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", false);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();

        System.out.println();
        System.out.println("===== Ejercicio 2: Vuelo =====");
        Vuelo vuelo1 = new Vuelo();
        Vuelo vuelo2 = new Vuelo("AV205", "Bogotá", "Medellín");
        Vuelo vuelo3 = new Vuelo("AV900", "Bogotá", "Cartagena", 50, 180);

        vuelo1.mostrarInfo();
        vuelo2.mostrarInfo();
        vuelo3.mostrarInfo();

        System.out.println("--- Probando embarcar y desembarcar en vuelo3 ---");
        vuelo3.embarcar();
        vuelo3.embarcar();
        vuelo3.desembarcar();
        vuelo3.mostrarInfo();

        System.out.println();
        System.out.println("===== Ejercicio 3: Depósito de agua =====");
        DepositoAgua deposito1 = new DepositoAgua(100);
        DepositoAgua deposito2 = new DepositoAgua(50, 10);

        // Conexión de desborde: se hace con el setter, no por constructor
        deposito1.setDepositoDesborde(deposito2);

        deposito1.mostrarInfo();
        deposito2.mostrarInfo();

        System.out.println("--- Probando el desbordamiento ---");
        deposito1.agregarAgua(120); // Supera la capacidad de deposito1, el resto va a deposito2

        deposito1.mostrarInfo();
        deposito2.mostrarInfo();
    }
