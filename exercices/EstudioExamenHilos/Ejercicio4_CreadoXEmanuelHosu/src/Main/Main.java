package Main;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Contador contador = new Contador();
		Thread[] hilos = new Thread[10];
		
		for (int i = 0; i < 10; i++) {
			hilos[i] = new Hilo("Hilo" + i ,contador);
			hilos[i].start();
		}
		
		try {
			for (Thread h : hilos) {
				h.join();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.printf("Cuenta final %d", contador.getCuenta());
	}
}
