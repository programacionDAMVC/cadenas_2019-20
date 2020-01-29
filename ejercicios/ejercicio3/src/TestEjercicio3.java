import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEjercicio3 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            lista.add(sc.nextLine());
        }
        System.out.printf("Líneas leídas: %d%n", lista.size());
        List<String> listaEmpiezanPor = Ejercicio3.obtenerNombresEmpiezanCaracter(
                lista, 'u');
        System.out.println(listaEmpiezanPor);
      //  System.out.println(Ejercicio3.obtenerCadenasNoAcabanVocal(lista));
        int[] valoresMaxMin = Ejercicio3.obtenerMaxMinCaracteres(lista);
        System.out.printf("Tamaño palabra mas chica es %d, y la mas grande es %d%n" ,
                valoresMaxMin[0], valoresMaxMin[1]);
        System.out.printf("Existe el nombre %s: %B%n", "paco",
                Ejercicio3.contieneNombre(lista, "paco"));
        System.out.println(Ejercicio3.obtenerSimilitud(lista, "bb"));
    }
}
