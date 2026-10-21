import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Tienes tomate? [S/N]: ");
        char x = teclado.next().charAt(0);
        if (x == 'N') {
            System.out.println("¡Tenemos que ir a comprar!");
        }else {
            System.out.println("¿Hay aceite? [S/N]: ");
            char z = teclado.next().charAt(0);
            if (z == 'N') {
                System.out.println("¡Tira a comprar!");
            } else {
                System.out.println("¿Hay jamón? [S/N]: ");
                char t = teclado.next().charAt(0);
                if (t == 'N') {
                    System.out.println("Ya estás tardando en ir a comprar");
                }else {
                    System.out.println("¡No tenemos que ir a comprar!");

                }
            }


        }
    }
}
