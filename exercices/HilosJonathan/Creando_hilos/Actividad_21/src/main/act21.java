package main;

public class act21 {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        
        System.out.println("Información del hilo:");
        System.out.println("Nombre del hilo: " + t1 .getName());
        System.out.println("ID del hilo: " + t1 .getId());
        System.out.println("Prioridad del hilo: " + t1 .getPriority());
        System.out.println("Estado del hilo: " + t1 .getState());
    }
}
