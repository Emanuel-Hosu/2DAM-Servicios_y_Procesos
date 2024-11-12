package Main;

public class SubThread extends Thread {

	@Override
	public void run() {
		int resultado = 0;
		for (int i = 10; i >= 0; i--) {
			System.out.println("Hilo 2 restará: " + i);
			resultado -= i;
		}
		
		System.out.println("Hilo 2: La resta total de los valores es: " + resultado);
	}
}
