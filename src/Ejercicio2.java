import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas horas trabajas al mes?: ");
        float horas = teclado.nextFloat();
        System.out.println("Introduce tu tarifa/h: ");
        float tarifa = teclado.nextFloat();
        if (horas>40) {
            float extra = horas - 40;
            System.out.println("Ganancias:"+30* 3/2*extra+ horas*tarifa+"€");
        }else {
            System.out.println("Ganancias: " + 30 * (horas * tarifa) + "€");
        }


    }
}
