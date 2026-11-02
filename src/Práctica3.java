import java.util.Scanner;

public class Práctica3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un multiplicando (3 cifras): ");
        Integer multiplicando = teclado.nextInt();

        System.out.println("Introduce un multiplicador (3 cifras): ");
        Integer mulmultpicador = teclado.nextInt();

        int multiplicacion = multiplicando * mulmultpicador;
        System.out.println("El producto de la multiplicación es: " + multiplicacion);






    }
}
