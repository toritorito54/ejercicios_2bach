import java.util.Scanner;

public class Ejercicio5_bucles {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = teclado.nextInt();
        for (int i = 0; i <=10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
