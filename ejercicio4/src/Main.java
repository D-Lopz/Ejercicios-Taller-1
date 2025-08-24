import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dL = new Scanner(System.in);
        int[] edad = new int[10];
        double total = 0, promedio = 0;

        System.out.println("Ingrese la edad de los 10 estudiantes");

        for (int i = 0; i < edad.length; i++) {

            System.out.print("Estudiante " + (i + 1) + ": ");
            edad[i] = dL.nextInt();

        }

        for (double elemento : edad) {
            total = total + elemento;
        }

        if (edad.length > 0) {
            promedio = total / edad.length;
        }

        System.out.println("El promedio de las edades es de: " + promedio + " años.");

        Arrays.sort(edad);

         int n1 = edad[4];
         int n2 = edad[5];

         int mediana = (n1 + n2) / 2;

        System.out.println("La mediana de las edades es: " + mediana);
    }
}