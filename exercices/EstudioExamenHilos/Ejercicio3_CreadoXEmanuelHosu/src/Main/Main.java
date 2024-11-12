package Main;

public class Main {
	public static void main(String[] args) {
		Thread h1 = new Thread(new Hilo("Hilo 1"));
		Thread h2 = new Thread(new Hilo("Hilo 2"));
		
		try {
			h1.run();
			h2.start();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Error encontrado en Main");
		}
		
	}
}
