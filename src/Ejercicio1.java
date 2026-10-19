import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas horas trabajas al mes?: ");
        float horas = teclado.nextFloat();
        System.out.println("Introduce tu tarifa/h: ");
        float tarifa = teclado.nextFloat();
        System.out.println("Ganancias: "+30*(horas * tarifa)+"€");

    }
}
