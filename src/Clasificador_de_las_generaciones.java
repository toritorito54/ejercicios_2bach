import java.time.LocalDateTime;
import java.util.Scanner;

public class Clasificador_de_las_generaciones {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        LocalDateTime fecha_hoy = LocalDateTime.now();

        int year_actual = fecha_hoy.getYear();

        System.out.println("Bienvenido al clasificador de generaciones");
        System.out.println("Modo 1: Obtén tu generación a partir del año de tu nacimiento");
        System.out.println("Modo 2: Obtén tu generación a partir de tu edad");
        System.out.println("Elige un modo (1 o 2): ");

        int modo = teclado.nextInt();

        switch (modo) {
             case 1:
                System.out.println("¿En qué año naciste?");
                teclado.nextLine();
                String year_st = teclado.nextLine();
                int year_nacimiento = Integer.parseInt(year_st);

                if ((year_nacimiento >= 1900) && (year_nacimiento <= year_actual)) {
                    System.out.println("Válido, naciste en " + year_nacimiento);

                    if (year_nacimiento <= 1927) {
                        System.out.println("Sin generación bautizada");
                    } else if (year_nacimiento <= 1944) {
                        System.out.println("Generación Silent");
                    } else if (year_nacimiento <= 1964) {
                        System.out.println("Generación Baby Boomers");
                    } else if (year_nacimiento <= 1981) {
                        System.out.println("Generación X");
                    } else if (year_nacimiento <= 1994) {
                        System.out.println("Generación Y o Millennials");
                    } else if (year_nacimiento <= year_actual) {
                        System.out.println("Generación Z o Centennials");
                    }
                } else {
                        System.out.println("Año no válido");
                }
                break;
            case 2:
                System.out.println("¿Qué edad tienes?");
                int edad = teclado.nextInt();
                int year_nacimiento2 = year_actual - edad;

                if ((edad >=0) && (year_nacimiento2>=1900)) {
                    System.out.println("Válido, tienes " + edad + " años");
                    System.out.println("y naciste en " + year_nacimiento2);

                    if (year_nacimiento2 <= 1927) {
                        System.out.println("Sin generación bautizada");
                    } else if (year_nacimiento2 <= 1944) {
                        System.out.println("Generación Silent");
                    } else if (year_nacimiento2 <= 1964) {
                        System.out.println("Generación Baby Boomers");
                    } else if (year_nacimiento2 <= 1981) {
                        System.out.println("Generación X");
                    } else if (year_nacimiento2 <= 1994) {
                        System.out.println("Generación Y o Millennials");
                    } else if (year_nacimiento2 <= year_actual) {
                        System.out.println("Generación Z o Centennials");
                    }
                } else {
                    System.out.println("Edad no válida");
                }
                break;
        }
    }
}

