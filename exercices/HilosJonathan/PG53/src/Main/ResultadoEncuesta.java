package Main;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

class ResultadosEncuesta {
    private final HashMap<String, Integer> totalPorRespuesta = new HashMap<>();
    private final HashMap<String, Integer> totalPorZona = new HashMap<>();

    // Suma una o nÃºmero de respuestas para la zona y para la respuesta
    synchronized public void anotaRespuesta(String idZona, String respuesta) {
        // HashMap del numero de respuestas (votos) de cada tipo
    	//Recoge el numro del partido que se recibe por parametro
        Integer numRespValor = this.totalPorRespuesta.get(respuesta);
        
        /*
        int numero;
        if(numRespValor == null)
        numero = 1;
        else
		numero = numRespValor+1;
		   */
        
        //EL PRIMER HASHMAP
        /*LO QUE HACE BASICAMENTE ESTE PUT ES QUE RECOGE EL KEY DEL PRIMER HASMAP Y COMPRUEBA
         * SI ESTA VACIO O NO, EN CASO DE QUE SI ESTA VACIO ESTE LE AÑADE UN 1, KA SEGUNDA
         * PARTE DE ESTO, ES QUE POR EJEMPLO SI EL PSOE TIENE 1 VOTO, SUMA EL NUMERO ANTERIOR
         * GUARDADO OSEA EL 1, Y LO SUMA +1
         */
        this.totalPorRespuesta.put(respuesta, numRespValor == null ? 1 : numRespValor + 1);
        // HashMap del numero de respuestas (votantes) por zona
        
        /*EL SEGUNDO HASHMAP*/
        /*
         * EN ESTE CASO SI EL LA KEY DE EL PRIMER HASMAP ES NULL, ESTA LE AÑADE 1 UNO,
         * Y SI NO ES NULL LE SUMA EL NUMERO ANTERIOR + 1
         * 
         * LA KEY DE ESTE HASMAP ES POR EJEMPLO PAU 200, ARANJUEZ 321, ETC
         * */
        Integer numRespZona = this.totalPorZona.get(idZona);
        this.totalPorZona.put(idZona, numRespZona == null ? 1 : numRespZona + 1);
    }

    //ESTE METODO DEVUELVE UN CONJUNTO DE TODAS LAS ZONAS QUE HAN VOTADO KEYS DEL SEGUNDO HASHMAP
    synchronized public Set<String> obtenZonas() {
        return this.totalPorZona.keySet();
    }

    //DEVUELVE TODOS LOS "PARTIDOS" KEYS DEL PRIMER HASHMAP
    synchronized public Set<String> obtenRespuestas() {
        return this.totalPorRespuesta.keySet();
    }

    synchronized public int obtenNumRespuestasZona(String zona) {
        return this.totalPorZona.get(zona);
    }

    synchronized public int obtenNumRespuestas(String respuesta) {
        return this.totalPorRespuesta.get(respuesta);
    }
}