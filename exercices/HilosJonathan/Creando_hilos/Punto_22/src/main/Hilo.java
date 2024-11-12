package main;

public class Hilo implements Runnable {
	private final String nombre;
	
	public Hilo(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {
		System.out.println("Hola, soy el hilo: " + this.nombre);
		System.out.println("Hilo %s terminado: " + this.nombre);
		
	}

}
