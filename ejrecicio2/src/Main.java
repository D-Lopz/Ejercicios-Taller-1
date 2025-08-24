public class Main {
    public static void main(String[] args) {

        int[] pares = new int[100];

        for (int i = 0; i < pares.length; i++) {
            int resto = i % 2;

                if(resto == 0){

                System.out.print(" " + i);
            }
        }
    }
}