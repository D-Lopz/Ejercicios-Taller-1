import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dL = new Scanner(System.in);
        int[] n = new int[10];
        double maximo = n[0];
        double minimo = n[0];

        System.out.println("Ingrese los 10 números enteros");

        for (int i = 0; i < n.length; i++) {

            System.out.print("Número: " + (i + 1) + ": ");
            n[i] = dL.nextInt();

        }

        for (double element : n) {
            if (element < minimo) {
                minimo = element;
            }
        }

        System.out.println("El número menor es: " + minimo);

        for (int i = 1; i < n.length; i++) {
            if (n[i] > maximo) {
                maximo = n[i];
            }
        }

        System.out.println("El número mayor es: " + maximo);
    }
}