import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la medida de uno de los lados : ");
        double x = teclado.nextDouble();
        System.out.println("Introduce la medida de otro lado : ");
        double z = teclado.nextDouble();
        System.out.println("Introduce la medida del último lado : ");
        double t = teclado.nextDouble();
        if ((x == z) && (x == t)) {
                System.out.println("Es equilátero");
        } else if (((x != t) && (x == z)) || ((x != z) && (x==t)) || ((x != z)) && (z == t)) {
            System.out.println("Es isósceles");
        } else {
            System.out.println("Es escaleno");

        }

        }
    }
