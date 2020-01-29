import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("uno", "dos", "tres",
            "cuatro", "cinco", "seis", "siete", "ab", "ocho", "nueve", "diez");
        List<String> listaEmpiezanPor = obtenerNombresEmpiezanCaracter(
                lista, 'u');
        System.out.println(listaEmpiezanPor);
        System.out.println(obtenerCadenasNoAcabanVocal(lista));
        int[] valoresMaxMin = obtenerMaxMinCaracteres(lista);
        System.out.printf("Tamaño palabra mas chica es %d, y la mas grande es %d%n" ,
                valoresMaxMin[0], valoresMaxMin[1]);
        System.out.printf("Existe el nombre %s: %B%n", "dos",
                contieneNombre(lista, "dos"));
        System.out.println(obtenerSimilitud(lista, "ñ"));

    }


    public static List<String> obtenerNombresEmpiezanCaracter(
            List<String> lista, char caracter) {
        String regex = ("^" + caracter +".*").toLowerCase();  //"^c.*
        List<String> listaEmpiezanPor = new ArrayList<>(); //lista cadenas vacía
        /*for ( String nombre: lista ) {
            if ( (nombre.charAt(0) + "").
                    equalsIgnoreCase(  caracter+ "") )
                listaEmpiezanPor.add(nombre);
        }*/
        for ( String nombre: lista ) {
            if (nombre.toLowerCase().matches(regex))
                listaEmpiezanPor.add(nombre);
        }
        return listaEmpiezanPor;

    }
    public static List<String> obtenerCadenasNoAcabanVocal(List<String> lista) {
        List<String> listaNoAcabanEn = new ArrayList<>(); //lista cadenas vacía
        for ( String nombre: lista ) {
            if ( nombre.toLowerCase().matches(".*[^aeiouáéíóú]$") )
                listaNoAcabanEn.add(nombre);
        }
        return listaNoAcabanEn;
    }

    public static int[] obtenerMaxMinCaracteres( List<String> lista ) {
        int[] valoresMaxMin = new int[2];
        String palabraMasGrande = "";  //una variante, se puede trabajar con longitudo como abajo
        int longitudPalabraMachica = Integer.MAX_VALUE;  //otra variante, pero esta es obligatoria

        for ( String nombre: lista ) {

            if (nombre.length() > palabraMasGrande.length()){
                palabraMasGrande = nombre;
            }

            if ( nombre.length() < longitudPalabraMachica ) {
                longitudPalabraMachica = nombre.length();

            }

        }

        valoresMaxMin[0] = longitudPalabraMachica; //longitud de la palabra mas chica
        valoresMaxMin[1] = palabraMasGrande.length(); // longitud palabra mas grande

        return valoresMaxMin;
    }

    public static boolean contieneNombre (List<String> lista, String nombre) {

        return lista.contains(nombre);

    }

    public static List<String> obtenerSimilitud (List<String> lista, CharSequence secuencia) {
        List<String> listaSimilitud = new ArrayList<>(); //lista cadenas vacía
        for ( String nombre: lista ) {
            if (nombre.contains(secuencia))
                listaSimilitud.add(nombre);
        }
        return listaSimilitud;
    }

}
