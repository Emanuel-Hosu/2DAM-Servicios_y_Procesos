package Main;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//Un hilo debe generar un número al azar entre cero y cien, que deben intentar adivinar otros diez hilos
		Thread[] hilos = new Thread[10];
		NumeroOculto numOculto = new NumeroOculto();
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			hilos[i] = new HiloConcursante(numOculto, "Hilo " + i);
			hilos[i].start();
		}
		
		for (Thread hilo : hilos) {
			try {
				hilo.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
