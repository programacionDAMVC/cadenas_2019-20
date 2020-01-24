import java.util.Scanner;

public class TestPalabraLeida {

    public static void main(String[] args) {

        System.out.println("Introduce una palabra");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();

        PalabraLeida palabraLeida = new PalabraLeida(palabra);
        System.out.printf("%s tiene %d letras%n"
                ,palabraLeida.getValor() , palabraLeida.obtenerNumeroLetras());
        System.out.printf("%s ¿empieza por vocal? %b%n"
                ,palabraLeida.getValor() , palabraLeida.comienzaPorVocal());
        System.out.printf("%s ¿acaba por vocal? %b%n"
                ,palabraLeida.getValor() , palabraLeida.acabaEnVocal());
        System.out.printf("%s tiene %d vocales%n"
                ,palabraLeida.getValor() , palabraLeida.obtenerNumeroVocales());
        System.out.printf("%s ¿contiene h/H? %b%n"
                ,palabraLeida.getValor() , palabraLeida.contieneH());
        System.out.printf("%s ¿es un palíndromo? %b%n"
                ,palabraLeida.getValor() , palabraLeida.esPalindromo());

        System.out.println("Introduce palabra a comparar");
        String palabraCompara = sc.next();
        System.out.printf("%s ¿es igual palabra que %s? %b%n"
                ,palabraLeida.getValor() , palabraCompara,
                palabraLeida.sonIguales(palabraCompara));
        sc.close();
    }
}
