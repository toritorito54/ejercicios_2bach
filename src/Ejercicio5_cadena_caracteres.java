import java.util.Scanner;

public class Ejercicio5_cadena_caracteres {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Jugador 1, introduce una frase");
        String frase = teclado.nextLine().toUpperCase();

        System.out.println("¡Jugador 2, start!");
        int corazones = 10;


        do {
            System.out.println("Jugador 2, introduce una palabra a buscar...");
            String palabra = teclado.nextLine().toUpperCase();

            if (frase.contains(palabra) == true) {
                System.out.println("¡Enhorabuena, has acertadooo!");
                corazones = -9875;
            } else {
                corazones = corazones - 1;
                if (corazones == 0) {
                    System.out.println("GAME OVER");
                } else {
                    System.out.println("mec! La palabra no se encuentra en la frase. Te quedan " + corazones + " vidas");
                }
            }
        }while (corazones > 0);

    }
}
