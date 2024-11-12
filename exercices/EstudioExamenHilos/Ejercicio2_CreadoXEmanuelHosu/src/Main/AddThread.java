package Main;

public class AddThread extends Thread{
	
	@Override
	public void run() {
		int resultado = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hilo 1 sumará: " + i);
			resultado += i;
		}
		System.out.println("Hilo 1: RESULTADO FINAL DEL HILO 1: " + resultado);
	}
}
