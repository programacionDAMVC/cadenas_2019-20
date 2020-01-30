import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtiladesString {
    public static final String[] PREPOSICIONES = {"a", "ante", "bajo", "cabe", "con", "contra", "de", "desde", "durante", "en", "entre", "hacia", "hasta", "mediante", "para", "por", "según", "sin", "so", "sobre", "tras", "versus" , "vía"};
    public static int obtenerNumeroPalabras(List<String> texto){
        return texto.size();
    }

    public static int obtenerNumeroPreposiciones(List<String> texto) {
        int contadorPreposiciones = 0;
        for (String palabra: texto) {
            for (int i = 0; i < PREPOSICIONES.length; i++) {
                if (palabra.equalsIgnoreCase(PREPOSICIONES[i]))
                    contadorPreposiciones++;
            }
        }
        return contadorPreposiciones;
    }
    public static int obtenerNumeroPreposicionesv0(List<String> texto) {
        int contadorPreposiciones = 0;

            for (int i = 0; i < PREPOSICIONES.length; i++) {
                contadorPreposiciones += Collections.frequency(
                        texto, PREPOSICIONES[i]);
            }

        return contadorPreposiciones;
    }
}
