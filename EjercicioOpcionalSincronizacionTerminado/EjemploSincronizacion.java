public class EjemploSincronizacion {
    public static void main(String[] args) {
        Fila fila = new Fila();

        HiloPersona persona1 = new HiloPersona(fila, "Persona 1");
        HiloPersona persona2 = new HiloPersona(fila, "Persona 2");
        HiloPersona persona3 = new HiloPersona(fila, "Persona 3");

        // Iniciar los hilos
        persona1.start();
        persona3.start();
        persona2.start();
    }}