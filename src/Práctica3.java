import java.util.Scanner;

public class Práctica3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int multiplicando;
        do {
            System.out.println("Introduce un multiplicando (3 cifras): ");
            multiplicando = teclado.nextInt();
        } while ( multiplicando <=99 || multiplicando > 999);

        int multiplicador;
        do {
            System.out.println("Introduce un multiplicador (3 cifras): ");
            multiplicador = teclado.nextInt();
        } while ( multiplicador <=99 || multiplicador > 999);

        int multiplicacion = multiplicando * multiplicador;
        System.out.println("El producto de la multiplicación es: " + multiplicacion);

        String numint = Integer.toString(multiplicador);
        String cifra1 = numint.substring(0, 1);
        String cifra2 = numint.substring(1, 2);
        String cifra3 = numint.substring(2, 3);

        int n_cifra1 = Integer.parseInt(cifra1);
        int n_cifra2 = Integer.parseInt(cifra2);
        int n_cifra3 = Integer.parseInt(cifra3);

        System.out.println("   " + multiplicando);
        System.out.println(" x " + multiplicador);
        System.out.println("---------");

        if (multiplicando * n_cifra3>99 && multiplicando * n_cifra3<=999) {
            System.out.println("   " + multiplicando * n_cifra3);
        }
        else if (multiplicando * n_cifra3 == 0) {
            System.out.println("     " + multiplicando * n_cifra3);
        }
        else System.out.println("  " + multiplicando * n_cifra3);

        if (multiplicando * n_cifra2>99 && multiplicando * n_cifra2<=999) {
            System.out.println("  " + multiplicando * n_cifra2 + "x");
        }
        else if (multiplicando * n_cifra2 == 0) {
            System.out.println("    " + multiplicando * n_cifra2 +"x");
        }
        else System.out.println(" " + multiplicando * n_cifra2 + "x");

        if (multiplicando * n_cifra1<=999) {
            System.out.println(" " + multiplicando * n_cifra1 + "xx");
        }
        else System.out.println(multiplicando * n_cifra1 + "xx");

        System.out.println("---------");

        if (multiplicacion>=99999) {
            System.out.println(multiplicacion);
        }
        else System.out.println(" " + multiplicacion);

    }
}

