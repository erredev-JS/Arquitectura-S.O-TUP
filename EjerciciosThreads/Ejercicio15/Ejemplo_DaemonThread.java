package EjerciciosThreads.Ejercicio15;

public class Ejemplo_DaemonThread {
    public static void main(String[] args){
        System.out.println("Comienza main()");
        Thread t=new Thread(new DaemondThread());
        t.setDaemon(true);
        //t.start();
        try{Thread.sleep(2000);
        }catch (InterruptedException e){};
        System.out.println("Termina main()");
    }
}

