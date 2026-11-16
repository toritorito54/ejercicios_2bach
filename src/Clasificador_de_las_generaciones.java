import java.time.LocalDateTime;
import java.util.Scanner;

public class Clasificador_de_las_generaciones {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige un modo 1 o 2: ");
        LocalDateTime fecha_hoy = LocalDateTime.now();
        int año_actual = fecha_hoy.getYear();

        int modo = teclado.nextInt();
        if (modo == 1) {
            int año = 1900;
            System.out.println("¿En qué año naciste?");
            int año_nacimiento = teclado.nextInt();
            if ((año_nacimiento >= año) && (año_nacimiento <= año_actual));{
                if ((año_nacimiento >= 1900) && (año_nacimiento <= 1927));{
                    System.out.println("Eres de los que no tienen una Generación Bautizada");

                }
            }
            }


        }

    }

