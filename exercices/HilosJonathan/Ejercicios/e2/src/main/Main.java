package main;

public class Main extends Thread {
	// Hay un Override aqui?
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Run: " + i);
		}
	}

	public static void main(String[] args) {
		Main mt = new Main();
		mt.start();
		mt.run();
		for (int i = 0; i <= 5; i++) {
			System.out.println("Main: " + i);
		}
	}
}
