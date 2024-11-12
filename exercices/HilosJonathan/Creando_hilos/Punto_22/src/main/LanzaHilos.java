package main;

public class LanzaHilos{
	public static void main(String[] args) {
		Thread h1 = new Thread(new Hilo("Hilo1"));
		Thread h2 = new Thread(new Hilo("Hilo2"));
		h1.start();
		h2.start();
		System.out.println("Hilo principal terminado.");
	}
}