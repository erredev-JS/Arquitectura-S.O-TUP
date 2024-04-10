package EjeFilosofos;
import java.util.Random;
public class Filosofo extends Thread{
    private int id;
    private static Cubierto[] cubiertos;
    public Filosofo(int id) {
        this.id = id;
    }

    public void run() {
        Cubierto c1 = new Cubierto(1);
        Cubierto c2 = new Cubierto(2);
        Cubierto c3 = new Cubierto(3);
        Cubierto c4 = new Cubierto(4);
        Cubierto c5 = new Cubierto(5);
        Cubierto[] cubiertosDeMesa = {c1,c2,c3,c4,c5};

    }

    public void pensar(){
        Random random = new Random();
        int tiempoPensando = random.nextInt(5001);
        System.out.println("El filosofo " + id + " está pensando");
        try {
            wait(tiempoPensando);
        }catch (Exception e){
            System.out.println(e);
        }
        comer();
    }
    public synchronized void agarrarCubierto(Cubierto[] listCubiertos){
        switch (this.id){
            case 1:
                if (!listCubiertos[0].isOcupado() || !listCubiertos[4].isOcupado()) {
                    System.out.println("El Filosofo " + this.id + " está comiendo");
               }
            case 2:
                if (!listCubiertos[1].isOcupado() || !listCubiertos[2].isOcupado()) {
                    System.out.println("El Filosofo " + this.id + " está comiendo");
                }
            case 3:
                if (!listCubiertos[2].isOcupado() || !listCubiertos[3].isOcupado()) {
                    System.out.println("El Filosofo " + this.id + " está comiendo");
                }

        }
    }
    public void comer(){
        //if ()
    }
}
