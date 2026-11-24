import java.util.Scanner;

public class Ejercicio7_bucles {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        int l = frase.length() - 1;
        for (int i = l; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
}
