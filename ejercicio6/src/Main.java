import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

         Scanner dL = new Scanner(System.in);
         int inicio, fin, aux;

         System.out.print("Cuantos números desea ingresar?: ");
         int n = dL.nextInt();
         
         int[] numeros = new int[n];

         for (int i = 0; i < numeros.length; i++) {

             System.out.print("Elemento " + (i + 1) + ": ");
             numeros[i] = dL.nextInt();
         }

         System.out.print("Arreglo original: ");
         for (int i = 0; i < numeros.length; i++) {

             System.out.print(numeros[i] + " ");
         }

         inicio = 0;
         fin = numeros.length - 1;

         while (inicio < fin){
             aux = numeros[inicio];
             numeros[inicio] = numeros[fin];
             numeros[fin] = aux;

             inicio++;
             fin--;
         }

         System.out.print("\nArreglo invertido: ");
         for (int i = 0; i < numeros.length; i++) {

             System.out.print(numeros[i] + " ");
         }
         dL.close();
     }
}