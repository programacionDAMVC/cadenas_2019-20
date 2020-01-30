import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEjercicio4 {

    public static void main(String[] args) {
       // System.out.println("Ejecutando programa");
        List<String> constitucion = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sPattern1 = "^([0-9]+/?[0-9]*[\\.,;]?)(.*?)$";
        String sPattern2 = "^[a-z]\\)$";
        Pattern pPattern1 = Pattern.compile(sPattern1);
        Pattern pPattern2 = Pattern.compile(sPattern2);
        Matcher matcher1, matcher2;

        while (sc.hasNext()){
            String palabra = sc.next();
            matcher1 = pPattern1.matcher(palabra);
            if (matcher1.find()){ //quitamos números
            //    System.out.println(palabra);
                if (matcher1.group(2).length() != 0 &&
                        matcher1.group(2).matches("^[^0-9].*")) {
                   // System.out.println(palabra + "-" + matcher1.group(2));
                    if (matcher1.group(2).contains(",") || matcher1.group(2).contains(".") ||
                            matcher1.group(2).contains(":"))
                        palabra = matcher1.group(2).replaceAll("[,\\.:]", "");
                    else
                        palabra = matcher1.group(2);
                    constitucion.add(palabra.toLowerCase());
                }
                continue;
            }
            matcher2 = pPattern2.matcher(palabra);
            if (matcher2.find()) { //quitamos a) b) c) d)
                continue;
            }
            if (palabra.contains(",") || palabra.contains(".") ||
                    palabra.contains(":"))
                palabra = palabra.replaceAll("[,\\.:]", "");

            if (palabra.matches("^I{1,3}|^I?[VX]I{0,3}")) {
               continue;
            }
            constitucion.add(palabra.toLowerCase());
        }
       // System.out.println(listaPalabras);
       // listaPalabras.forEach(System.out::println);
        System.out.printf("La constitución tiene %d palabras.%n",
                UtiladesString.obtenerNumeroPalabras(constitucion));
        System.out.printf("La constitución tiene %d preposiciones.%n",
                UtiladesString.obtenerNumeroPreposiciones(constitucion));
        System.out.printf("La constitución tiene %d preposiciones.%n",
                UtiladesString.obtenerNumeroPreposicionesv0(constitucion));
    }
}
