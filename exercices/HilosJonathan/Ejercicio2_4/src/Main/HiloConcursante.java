package Main;

import java.util.Random;

class HiloConcursante extends Thread {
	private final NumeroOculto numOculto;
	private final String id;
	private Random r = new Random();

	/**
	 * Constructora
	 * 
	 * @param numOculto
	 * @param id
	 */
	public HiloConcursante(NumeroOculto numOculto, String id) {
		this.numOculto = numOculto;
		this.id = id;
	}

	@Override
	public void run() {
		System.out.printf(">> Hilo %s comienza.\n", this.id);
		//El juego termina cuando la variable es true
		boolean juegoTerminado = false;
		//genera numeros todo el rato y llama a propuesta hilo
		while (!juegoTerminado) {
			// El hilo i-esimo propone un numero en [0, 20] -> Hacer un random de 0 a 20
			int num = r.nextInt(21);
			System.out.printf(this.id + " propone el numero " + num + "\n");
			// Se comprueba si se ha acertado llamando al metodo propuestaNumero(pasa el numero generado en num linea 29), y se
			// guarda el resultado para hacer el if y elseif que viene a continuación}
			
			// Si el resultado es -1, el juego termina, se imprime qué otro hilo ha acertado
			// Aquí va un if
			// Si es 1, se imprime que el hilo i-esimo ha acertado
			// Aquí va un elseif
			int guadador = num;
			
			if (numOculto.propuestaNumero(guadador) == -1) {
				System.out.println("==" + this.id + " ha acertado usando el numero " + guadador);
				juegoTerminado = true;
			}else if (numOculto.propuestaNumero(guadador) == 1){
				juegoTerminado = false;
			}else {
				System.out.println("No se ha encontrado el numero oculto");
				juegoTerminado = false;
				
			}
			
			//triple, si la variable booleana de porpuestaNumero() es true, tiene que devolver siempre un -1 a los otros hilos que acierten
		}
		// Al salir del bucle, el hilo ha terminado. Asi que se imprime eso mismo
		System.out.printf("## Hilo %s termina.\n", this.id);
	}
}