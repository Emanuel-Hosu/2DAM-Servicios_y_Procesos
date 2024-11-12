package Main;

import java.util.Set;

public class Encuesta {
    private static final int NUM_ZONAS = 20;
    
    public static void main(String[] args) {
    	//SE CREA UN OBJETO DE TIPO RESULTADO RESPUESTA
    	//TODOS LOS HILOS (VOTANTES), VAN A COMPARTIR TODOS EL MISMO OBJETO
        ResultadosEncuesta resultados = new ResultadosEncuesta();
        
        //CREACION DE UN ARRAY DE 20 HILOS
        Thread[] encuestadores = new Thread[NUM_ZONAS];
        for (int i = 0; i < NUM_ZONAS; i++) {   // Crea hilos
        	//ESTA CLASE TIENE QUE TENER IMPLEMENTADO EL RUN, YA QUE SERA UNA CLASE HILO A PARTIR DE AHORA
        	//SE EL ENVIA POR PARAMETRO (AL HILO), LO QUE SALE EN EL () DE ENCUESTRADORZONA
        	//LOS HILOS SON LOS ENCUSTRADORES ZONA ...
            Thread encuestador = new Thread( new EncuestadorZona("zona" + (i + 1), resultados));
            encuestadores[i] = encuestador;
        }
        
        //RECORRE EL ARRAY DE ENCUESTADORES Y EJECUTA EL METODO START DE CADA encuestador
        for (Thread encuestador : encuestadores) {   // Lanza hilos
            encuestador.start();
        }
        
        //ESPERA A QUE TODOS LOS ENCUESTADORES DE CADA ZONA, VA A ESPERAR A QUE CADA HILO
        //ACABE CON SU METODO RUN()
        for (Thread encuestador : encuestadores) {   // Espera que terminen
            try {
                encuestador.join();
            } catch (InterruptedException ex) {
            }
        }
        
        //ESTE NUNCA SE EJECUTARA ANTES DE QUE LOS HILOS HAYAN ACABADO SU EJECUCION.
        System.out.println("Encuestados por zonas:");
        Set<String> zonas = resultados.obtenZonas();
        int granTotalPorZonas = 0;
        for (String zona : zonas) {
            int totalParaZona = resultados.obtenNumRespuestasZona(zona);
            System.out.printf("%s: %d\n", zona, totalParaZona);
            granTotalPorZonas += totalParaZona;
        }
        System.out.printf("TOTAL: %d\n", granTotalPorZonas);
        
        System.out.println("Resultados por respuesta:");
        Set<String> respuestas = resultados.obtenRespuestas();
        int granTotalPorRespuestas = 0;
        for (String respuesta : respuestas) {
            int totalParaRespuesta = resultados.obtenNumRespuestas(respuesta);
            
            if(respuesta != null)
            System.out.println(respuesta + ": " + totalParaRespuesta);
            else 
            System.out.println("NS/NC: " + totalParaRespuesta);

            //System.out.printf("%s: %d\n", respuesta != null ? respuesta : "NS/NC", totalParaRespuesta);
            granTotalPorRespuestas += totalParaRespuesta;
        }
        System.out.printf("TOTAL: " + granTotalPorRespuestas);
    }
}