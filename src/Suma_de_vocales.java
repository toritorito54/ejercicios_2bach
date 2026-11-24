import java.util.Scanner;

public class Suma_de_vocales {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = teclado.nextLine().toUpperCase();

        int l = frase.length() - 1;
        int vocales = 0;
        int a = 0;
        int e = 0;
        int i_vocal = 0;
        int o = 0;
        int u = 0;


        for (int i = 0; i <= l; i++) {
            int contar = frase.charAt(i);

            switch (contar) {
                case 'A':
                    vocales = vocales+1;
                    a = a+1;
                    break;
                case 'E':
                    vocales = vocales+1;
                    e = e+1;
                    break;
                case 'I':
                    vocales = vocales+1;
                    i_vocal = i_vocal+1;
                    break;
                case 'O':
                    vocales = vocales+1;
                    o = o+1;
                    break;
                case 'U':
                    vocales = vocales+1;
                    u = u+1;
                    break;
            }


        }
        System.out.println("Cantidad total de vocales (no acentuadas): " + vocales + " vocales");
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i_vocal);
        System.out.println("O: " + o);
        System.out.println("u: " + u);
    }
}
