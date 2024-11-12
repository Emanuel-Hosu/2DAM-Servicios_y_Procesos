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

	// AQUÍ VA EL MÉTODO PROPUESTANUMERO(INT) RETORNAR -1 SI EL JUEGO ACABA. MÉTODO QUE RECIBE POR PARÁMETRO Y COMPRUEBA QUÉ ES LO QUE PASA
	/*IF NÚMERO RECIBIDO POR PARÁMETRO == A NÚMERO OCULTO ENTONCES NUMADIVINADO = TRUE Y RETORNAR TRUE, SI ES AL REVÉS RETORNAR FALSE;*/

	
	public synchronized int propuestaNumero(int recibido) {
	    //B) 1 SI EL NÚMERO PROPUESTO (NUM) ES EL NÚMERO OCULTO.
	    if (recibido == this.numOculto && !this.numAdivinado) {
	        this.numAdivinado = true;
	        return -1; // Retornar -1 para indicar que se ha acertado el número
	    } else {
	        return 1;
	    }
	}
}