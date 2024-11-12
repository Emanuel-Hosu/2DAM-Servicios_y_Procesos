package Main;

public class Hilo extends Thread {
	private String name;
	private Contador contador = new Contador();
	
	public Hilo(String _name) {
		this.name = _name;
	}
	
	@Override
	public void run() {
		contador.incrementa();
		System.out.println("El hilo: " + this.name + " ha incrementado hasta " + contador.getCuenta());
	}
}
