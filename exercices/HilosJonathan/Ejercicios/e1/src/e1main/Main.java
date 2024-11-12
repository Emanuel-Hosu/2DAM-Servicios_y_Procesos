package e1main;

public class Main extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Run: " + i);
		}
	}

	public static void main(String[] args) {
		Main mt = new Main();
		mt.run(); // Calls run() method
		mt.start(); // Calls run() method... again!
		for (int i = 0; i <= 5; i++) {
			System.out.println("Main: " + i);
		}
	}
}



