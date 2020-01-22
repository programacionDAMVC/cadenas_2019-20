import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class TestRegex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex1 = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-[0-9]{4}$";
        String regex2 = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$";

        String fecha = "";
        do {
            System.out.println("Introduce fecha válida"); //10-10-2000
            fecha = sc.next();
           } while ( !((fecha.matches(regex1) || fecha.matches(regex2))
                && comprobarDias(fecha))) ;
     //   } while ( !(fecha.matches(regex1) || fecha.matches(regex2)) );
        sc.close();
        System.out.printf("Fecha aceptada como string: %s%n", fecha);
        DateTimeFormatter fechaFormateadaConGuion =
                DateTimeFormatter.ofPattern("dd-LL-yyyy");
        DateTimeFormatter fechaFormateadaConBarra =
                DateTimeFormatter.ofPattern("dd/LL/yyyy");
        LocalDate localDate;
        if (fecha.contains("-")) {
            localDate = LocalDate.parse(fecha, fechaFormateadaConGuion);
        } else {
            localDate = LocalDate.parse(fecha, fechaFormateadaConBarra);
        }

        System.out.println("Fecha aceptada como localdate: " + localDate);
        int annosTranscurridos =
                Period.between(localDate, LocalDate.now()).getYears();
        System.out.printf("Años transcurridos %d%n", annosTranscurridos);

    }

    private static boolean comprobarDias(String fecha) {
        String[] trozos = fecha.split("[-/]");
        int dia  = Integer.parseInt(trozos[0]);
        int mes  = Integer.parseInt(trozos[1]);
        int anno = Integer.parseInt(trozos[2]);
        boolean correcto = false;
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                correcto = dia < 31;
                break;
            case 2:
                if (anno % 4 == 0)
                    correcto = dia < 30;
                else
                    correcto = dia < 29;
            break;
            default:
                correcto = dia < 32; //sobra porque nunca llega 32
                break;
        }
        return correcto;
    }
}
