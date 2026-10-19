import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas horas trabajas al mes?: ");
        float horas = teclado.nextFloat();
        System.out.println("Introduce tu tarifa/h: ");
        float tarifa = teclado.nextFloat();
        float salario = horas * tarifa;
        if (horas>40) {
            float extra = horas - 40;
            float solosalario = (horas - extra) * tarifa;
            System.out.println("Ganancias:"+ (1.5 * extra + solosalario) + "€");
        }else {
            System.out.println("Ganancias: " + salario + "€");
        }


    }
}
