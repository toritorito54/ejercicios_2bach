import java.util.Scanner;

public class Práctica3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un multiplicando (3 cifras): ");
        Integer multiplicando = teclado.nextInt();

        System.out.println("Introduce un multiplicador (3 cifras): ");
        Integer mulmultpicador = teclado.nextInt();

        if ((mulmultpicador >=100 && multiplicando >= 100) || (multiplicando <=1000  && mulmultpicador > 1000)) {


            int multiplicacion = multiplicando * mulmultpicador;
        System.out.println("El producto de la multiplicación es: " + multiplicacion);

            String numint = Integer.toString(mulmultpicador);
            String cifra1 = numint.substring(0, 1);
            String cifra2 = numint.substring(1, 2);
            String cifra3 = numint.substring(2, 3);

            int n_cifra1 = Integer.parseInt(cifra1);
            int n_cifra2 = Integer.parseInt(cifra2);
            int n_cifra3 = Integer.parseInt(cifra3);

            System.out.println("   " + multiplicando);
            System.out.println(" x " + mulmultpicador);
            System.out.println("---------");

            System.out.println("   " + mulmultpicador * n_cifra1);
            System.out.println("  " + mulmultpicador * n_cifra2 + "x");
            System.out.println(" " + mulmultpicador * n_cifra1 + "xx");
            System.out.println("---------");
            System.out.println(" " + multiplicacion);


        }
    }
}

