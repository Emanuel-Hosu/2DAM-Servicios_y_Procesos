package Main;

public class Hilo implements Runnable {
	private String name;
	
	public Hilo(String _name) {
		this.name = _name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hola soy el hilo: " + name);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println(name + " ha finalizado su ejecucion");
	}

}
