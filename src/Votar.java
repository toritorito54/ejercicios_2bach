import java.util.Scanner;

public class Votar {
    static void main () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué edad tienes?");
        int edad = teclado.nextInt();
        if (edad <= 0) {
            System.out.println("No me mientas :)");
        }else {
        if (edad >= 18) {
            System.out.println("Puedes votar");
        }else {
            System.out.println("No puedes votar, GET OUT");
        }

        }
    }
}
