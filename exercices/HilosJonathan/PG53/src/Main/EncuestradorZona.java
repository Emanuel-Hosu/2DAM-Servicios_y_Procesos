package Main;

import java.util.Random;

//UNA CLASE ES UN HILO, CUANDO ESTA IMPLEMENTE RUNNABLE
class EncuestadorZona implements Runnable {
    private final String idZona;
    private final ResultadosEncuesta resultados;

    EncuestadorZona(String idZona, ResultadosEncuesta resultados) {
        this.idZona = idZona;
        this.resultados = resultados;
    }

    @Override
    public void run() {
        System.out.printf(">>Encuestador para zona %s comienza.\n", this.idZona);
        Random r = new Random();
        //QUE EL ENCUESTADOR LLAME ENTRE 100 Y 200 CASAS PARA PREGUNTARLES A QUIEN VOTA
        int numRespuestas = 100 + r.nextInt(200 - 100) + 1;
        for (int i = 0; i < numRespuestas; i++) {
        	//SE GENRA UNA RESPUESTA ALEATORIA ENTRE 0 Y 9
            int numRespuesta = r.nextInt(10);  // Respuesta 0 a 9, o NS/NC
            //SE DECLARA UNA VARIABLE RESPUESTA QUE SE INICIALIZA A NULL
            String respuesta = null;
            //SI EL NUMERO ANTERIORMENTE GENERADO ES > 0, ENTONCES RESPUESTA_3
            if (numRespuesta > 0) {
                respuesta = "respuesta_" + numRespuesta;
            }
            
            //SI HAY ALGUN 0 GENERADO ESTE ENVIA LA RESPUESTA COMO NULL
            this.resultados.anotaRespuesta(this.idZona, respuesta);
        }
        System.out.printf("##Encuestador zona %s termina.\n", this.idZona);
    }
}