import java.util.Scanner;

public class Suma_descendente {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta un número (500-100000): ");
        int n = teclado.nextInt();

        if ((n >= 500) || (n <= 100000)) {
            String numint = Integer.toString(n);

            //switch (numint) {
//                case n == 100000:
//                        String cn1 = numint.substring(0, 6);
//                        int n1 = Integer.parseInt(cn1);
//                        String n2 = numint.substring(0, 5);
//                        String n3 = numint.substring(0, 4);
//                        String n4 = numint.substring(0, 3);
//                        String n5 = numint.substring(0, 2);
//                        String n6 = numint.substring(0, 1);
//                        suma = cn1;
//                    System.out.println(n1 + n2 + n3 + n4 + n5 + n6 = );
//                break;
            int t_numimt = numint.length()-1;
            for (int i = t_numimt; i > 0; i-- ) {
                String cn1 = numint.substring(0, i);
                        int n1 = Integer.parseInt(cn1);
                System.out.println(cn1);

            }


            }
        }
    }

