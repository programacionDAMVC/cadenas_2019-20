import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtilidadesString {
    public static final String[] PREPOSICIONES =
            {"a", "ante", "bajo", "cabe", "con", "contra", "de", "desde",
                    "durante", "en", "entre", "hacia", "hasta", "mediante",
                    "para", "por", "según", "sin", "so", "sobre", "tras",
                    "versus" , "vía"};
    public static final String[] ARTICULOS_DETERMINADOS =   {"el","lo", "la", "los", "las"};
    public static final String[] ARTICULOS_INDETERMINADOS =   {"un", "una", "unos", "unas"};

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
    public static int obtenerNumeroArticulosDeterminados(List<String> texto) {
        int contadorArticulosDeterminados = 0;

        for (int i = 0; i < ARTICULOS_DETERMINADOS.length; i++) {
            contadorArticulosDeterminados += Collections.frequency(
                    texto, ARTICULOS_DETERMINADOS[i]);
        }

        return contadorArticulosDeterminados;
    }

    public static int obtenerNumeroArticulosIndeterminados(List<String> texto) {
        int contadorArticulosIndeterminados = 0;

        for (int i = 0; i < ARTICULOS_INDETERMINADOS.length; i++) {
            contadorArticulosIndeterminados += Collections.frequency(
                    texto, ARTICULOS_INDETERMINADOS[i]);
        }

        return contadorArticulosIndeterminados;
    }

    //con solo este método podemos localizar cualquier tipo de tokens
    public static int obtenerNumeroTokens(List<String> texto, String[] tokens) {
        int contador = 0;
        for (String palabra : texto) {
            for (int i = 0; i < tokens.length; i++) {
                if (palabra.equalsIgnoreCase(tokens[i]))
                    contador++;
            }
        }
        return contador;
    }
}
