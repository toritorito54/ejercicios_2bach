import java.util.Scanner;

public class Suma_de_vocales {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = teclado.nextLine();
        int l = frase.length() - 1;
        for (int i = 0; i >= l; i++) {
            int contar = frase.charAt(i);
            switch (contar) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
            }break;


        }

    }
}
