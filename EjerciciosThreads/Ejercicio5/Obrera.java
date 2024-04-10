package EjerciciosThreads.Ejercicio5;

public class Obrera extends Thread{
    private String resultado = "No calculado";
    public void run(){
        resultado = calcula();
    }
    private String calcula(){
// Realiza un cálculo largo.
        try {Thread.sleep(10000);
        } catch(InterruptedException e){};
        return "Ya calculado";
    }
    public String getResultado(){
        return resultado;
    }
}