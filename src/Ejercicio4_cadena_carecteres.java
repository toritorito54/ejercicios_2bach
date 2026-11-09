import java.util.Scanner;

public class Ejercicio4_cadena_carecteres {
    static void main() {
        System.out.println("Introduce una frase");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        System.out.println("Introduce una palabra para localizar en la frase");
        String palabra = teclado.nextLine();
        String frase2 = frase.replace(palabra, "");

    }

}
