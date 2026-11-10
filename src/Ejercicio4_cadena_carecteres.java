import java.util.Scanner;

public class Ejercicio4_cadena_carecteres {
    static void main() {
        System.out.println("Introduce una frase");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine().toUpperCase();
        System.out.println("Introduce una palabra para localizar en la frase");
        String palabra = teclado.nextLine().toUpperCase();
        String frase2 = frase.replace(palabra, "");
        int largo1 = frase.length();
        int largo2 = frase2.length();
        int repite = (largo1-largo2)/palabra.length();
        System.out.println("La palabra aparece un total de " + repite + " veces");


    }

}
