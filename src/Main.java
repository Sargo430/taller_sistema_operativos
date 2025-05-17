import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int largoVector = 10;
        int cantidad_vectores=10000;

        int k=0;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de vectores cercanos: ");
        k=entrada.nextInt();
        long startTime = System.currentTimeMillis();
        int[][] vectores = new int[cantidad_vectores][largoVector];
        Random random = new Random();
        for (int i = 0; i < cantidad_vectores; i++) {
            for (int j = 0; j < largoVector; j++) {
                vectores[i][j] = random.nextInt(100);
            }
        }
        double[] distancias = new double[cantidad_vectores];
        int[] vector1 =new int[largoVector];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = random.nextInt(100);
        }


        double aux =0;
        for (int i = 0; i < cantidad_vectores; i++) {
            aux=0;
            for (int j = 0; j < largoVector; j++) {
                aux+= Math.pow((vectores[i][j] - vector1[j]), 2);
            }
            distancias[i]=Math.sqrt(aux);

        }






        double[] temp = Arrays.copyOf(distancias,cantidad_vectores);
        Arrays.sort(temp);
        double[] vectores_cercanos=Arrays.copyOf(temp,k);


        for (int i = 0; i < k; i++) {
            System.out.println(vectores_cercanos[i]);
        }
        long endTime = System.currentTimeMillis();

        System.out.print("Tiempo: "+(endTime - startTime) + " millis");



    }
}