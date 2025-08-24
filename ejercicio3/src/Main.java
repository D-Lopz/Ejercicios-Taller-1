import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dL = new Scanner(System.in);

        int[] n = new int[5];
        double total = 0, promedio = 0;

        for (int i = 0; i <n.length; i++) {

            System.out.printf("Introduzca número %d: ", i + 1);
            n[i] = dL.nextInt();

        }

        System.out.println("Los números introducios fueron = ");

        for (int i = 0; i < n.length; i++) {

            System.out.print( n[i] + " ");

        }
        for (double elemento : n) {
            total = total + elemento;

        }

        System.out.println("");
        System.out.println("La suma de todos es: " + total);

        if (n.length > 0) {
            promedio = total / n.length;
        }

        System.out.println("Su promedio fue de: " + promedio);
    }
}