import java.util.Scanner;

public class Ejercicio3_cadena_caracteres {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        String n = teclado.next();
        System.out.println("Introduce el número de cifras que quieres quitar");
        int m = teclado.nextInt();
        int pos_final = n.length()-m;
        System.out.println(n.substring(0, pos_final));




    }
}