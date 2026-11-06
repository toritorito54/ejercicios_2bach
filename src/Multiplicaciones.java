public class Multiplicaciones {
    static void main() {
        int numero = 123;
        String numero_string = Integer.toString(numero);
        System.out.println(numero_string);

        String cifra1 = numero_string.substring(2,3);
        int cifra1_numero = Integer.parseInt(cifra1);
        System.out.println(cifra1_numero);

        int derecha = numero % 10;
        int medio = (numero / 10) % 10;
        int izquierda = (numero / 100);

        System.out.println(derecha + " " + medio + " " + izquierda);
    }
}
