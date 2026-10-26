import java.util.Scanner;

public class Práctica2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");
        System.out.println("Introduce tu altura (cm)");
        int altura = teclado.nextInt();

        if ((altura > 230) || (altura <= 0)) {
            System.out.println("ERROR DE LECTURA DE LA ALTURA. VUELVE A MEDIRTE");
        } else if (altura < 140) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + (140 - altura) + " cm");
        }
        System.out.println("Indica tu peso (kg)");
        float peso = teclado.nextFloat();
        float pesominimo = altura * 2 / 8;
        if (((peso > 120) || (peso < pesominimo)) || ((peso <= 0))){
            System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");

        } else
            System.out.println("¡¡SUBE A LA ATRACCIÓN!!");


        }
    }

