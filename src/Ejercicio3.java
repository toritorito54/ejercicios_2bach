import java.util.Scanner;

public class Ejercicio3  {

    static void main() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un número: ");

    int x = teclado.nextInt();
    if (x == 0) {
        System.out.println("Es natural");
    } else if (x > 0) {
        System.out.println("Es positivo");
    } else if (x<0) {
        System.out.println("Es negativo");

    }
    }
}

