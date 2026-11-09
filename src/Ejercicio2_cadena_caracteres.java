import java.util.Scanner;

public class Ejercicio2_cadena_caracteres {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra1 = teclado.nextLine();
        System.out.println("Introduce otra palabra");
        String palabra2 = teclado.nextLine();
        if (palabra1.length() > palabra2.length()) {
            System.out.println(palabra1 + " es más larga que " + palabra2);
        } else if (palabra2.length() > palabra1.length()) {
            System.out.println(palabra2 + " es más larga que " + palabra1);
        }else {
            System.out.println(palabra2 + " es igual que " + palabra1);


        }
    }
}
