import java.util.Scanner;

public class Ejercicio6_bucles {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres sumar?: ");
        int n = teclado.nextInt();

        int suma = 0;
        for (int i= 1; i <=n; i++){
                System.out.print("Inserta nº" + i + " : ");
                int veces = teclado.nextInt();

                suma += veces;

            }
        System.out.print("El resultado es: " + suma);

    }
    }