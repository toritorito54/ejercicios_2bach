import java.util.Scanner;

public class Ejercicio61_bucles {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = teclado.nextInt();
        int contador = 1;
        System.out.print(n + "! = ");
        for (int i= n; i >=1; i--){
            if (i == 1){
                System.out.println(i);
            }else{
                System.out.print(i + "*");

            }
            contador = contador*i;
    }
        System.out.println(contador);
    }
}
