package Main;

public class Hilo extends Thread {
	private String nombreHilo;
	private final int num_Final = 10000;
	private Contador contador = new Contador();
	
	public Hilo(String _nombreHilo, Contador _contador) {
		this.nombreHilo = _nombreHilo;
		this.contador = _contador;
	}
	
	@Override
	public void run() {
		int num_total = 0;
		for (int i = 0; i < num_Final; i++) {
			contador.incrementa();
			num_total ++;
		}
		System.out.println(nombreHilo + " ha incrementado " + num_total);
	}
}
