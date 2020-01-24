import java.util.Random;
import java.util.Scanner;

public class TestClave {
    public static void main(String[] args) {
        System.out.println("Introduce tamaño de la clave");
        Scanner sc = new Scanner(System.in);
        int tamanno = sc.nextInt();
        String clave = "";
        for (int i = 0; i < tamanno; i++) {
            clave += obtenerCaracter();
        }
        Clave claveObjeto = new Clave(clave);
        System.out.printf("Clave: %s ¿es segura? %B%n",
                claveObjeto, claveObjeto.esClaveSegura() );

    }

    private static char obtenerCaracter() {
        final String  FUENTE_CARACTERES = "aAbBcCdDeEfFgGh-HiIjJkKlLmMnNñ" +
                "ÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
        Random random = new Random();
        int aleatorio = random.nextInt(FUENTE_CARACTERES.length());
        return FUENTE_CARACTERES.charAt(aleatorio);

    }
}
