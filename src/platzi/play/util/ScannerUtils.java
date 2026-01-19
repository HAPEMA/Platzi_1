package platzi.play.util;

import java.util.Locale;
import java.util.Scanner;

public class ScannerUtils {
    /*
        CONSTANTES:
            Es un valor que no cambiara en ningun momento y su creacion de nombre es en mayusculas.
            se utilizar la etiqueta Final para saber que es una constante.

         STACTIC:
            Es para decir que este es un metodo que no se debe inicializar para usarlo.
    */
    public static final Scanner SCANNER = new Scanner(System.in).useLocale(new Locale("us", "US"));

    public static String capturartexto(String mensaje){
        System.out.println(mensaje + ": ");
        return SCANNER.nextLine();
    }
    public static int capturarEntero(String mensaje) {
        System.out.println(mensaje + ": ");
        while (!SCANNER.hasNextInt()) {
            System.out.println("Dato es Invalido. " + mensaje + ": ");
            SCANNER.next();
        }
        int dato = SCANNER.nextInt();
        SCANNER.nextLine();
        return dato;
    }
    public static double capturarDecimal(String mensaje){
        System.out.println(mensaje + ": ");
        while (!SCANNER.hasNextDouble()) {
            System.out.println("Dato es Invalido. " + mensaje + ": ");
            SCANNER.next();
        }
        double dato = SCANNER.nextDouble();
        SCANNER.nextLine();
        return dato;
    }
}
