package Main;

public class lanzaHilosHastaQueTermine {
    public static void main(String[] args) {
        Thread h1 = Thread.currentThread();
        
        h1.start();
        
        try {
            h1.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal terminado.");
    }
}