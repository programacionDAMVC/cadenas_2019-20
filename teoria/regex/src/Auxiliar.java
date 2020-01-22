import java.util.Scanner;

public class Auxiliar {
    public static boolean validarNSS(String nss) {
       // System.out.println("en método validar: " + nss);
        String regexProvincia = "(0[1-9]|[1-4][0-9]|5[0123]|66)";
        String regexNumAfiliacion = "[\\d]{8}";
        String regexDigitoControl = "[0-9]{2}";
        String regexDefinitiva = "^" + regexProvincia + regexNumAfiliacion +
                regexDigitoControl + "$";
        return nss.matches(regexDefinitiva) && comprobarDC(nss);
    }

    private static boolean comprobarDC(String nss) { //nss tiene doce caracteres
        String cadena1 = nss.substring(0, 10); //diez primeros dígitos
        String dc = nss.substring(10); //dos últimos dígitos
        return Long.parseLong(cadena1) % 97 == Integer.parseInt(dc);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nss ="";
        do {
            System.out.println("Introduce nss");
            nss = sc.next();
        } while ( !validarNSS(nss.replace("/", "")));
       // System.out.println("en método main: " + nss);
    }
}
