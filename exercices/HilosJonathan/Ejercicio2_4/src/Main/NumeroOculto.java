package Main;
import java.util.Random;

class NumeroOculto {
	private final int numOculto;
	private boolean numAdivinado = false;

	/**
	 * Constructora
	 */
	public NumeroOculto() {
		Random r = new Random();
		this.numOculto = r.nextInt(21);
		System.out.printf("[[Creado número oculto: %d]]\n", this.numOculto);
	}

	// Aquí va el método propuestaNumero(int) retuurn -1 si el juego acaba. metodo que recibe por parametro y comprueba que es lo que pasa
		/*If numero recibido por parametro == a num oculto entonces numAdivinado = True y return true, si es al reves return false;*/
}