import java.util.Scanner;

public class Ejercicio3  {

    static void main() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un número: ");

    double x = teclado.nextDouble();
    if (x == 0) {
        System.out.println("Es natural");
    } else if (x > 0) {
        System.out.println("Es positivo");
    } else {
        System.out.println("Es negativo");

    }
    }
}

