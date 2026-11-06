import java.util.Scanner;

public class Ejercicio1_cadena_caracteres {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola soy vicherval");
        String texto = "Hola soy vicherval";
        System.out.println(texto.length());
        System.out.println(texto.replace(" ",""));
        System.out.println("Primera mitad del texto es: " + texto.substring(0,texto.length()/2) + "y la segunda mitad del texto es: " + texto.substring(texto.length()/2));
        System.out.println(texto.toUpperCase());


    }
}
