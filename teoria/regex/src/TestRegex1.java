import java.util.Scanner;

public class TestRegex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números:");
        String sNumero = sc.next();
        //1,2,3,4....
       if (sNumero.matches("^[1-9][0-9]*")) {
            System.out.printf("%s: es un nº natural%n", sNumero);
            int iNumero = Integer.parseInt(sNumero);
        }
       //....-2,-1,0,1,2,3...
       if (sNumero.matches("^-?[1-9][0-9]*$|^0$")){
            System.out.printf("%s: es un nº entero%n", sNumero);
            int iNumero = Integer.parseInt(sNumero);
        }
       // enteros más 0.1, -0.2, 0,25, -0,6 , 12,25 -12.25 ...
        if (sNumero.matches("^-?[1-9][0-9]*$|^0$|^-?0[\\.,][0-9]+$" +
                "|^-?[1-9][0-9]*[\\.,][0-9]+$")) {
            System.out.printf("%s: es un nº real%n", sNumero);
            double dNumero = Double.parseDouble(sNumero.replace(',','.'));
        }
        else
            System.out.println("No es un formato de nº válido");

        sc.close();



    }
}
