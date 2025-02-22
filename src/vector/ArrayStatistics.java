package vector;

import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double array[] = new double[6];

        System.out.println("Insira 6 valores reais.");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        double smallestValue = array[0];
        double biggestValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggestValue) {
                biggestValue = array[i];
            }
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }
        System.out.println("O maior valor é: " + biggestValue);
        System.out.println("O menor valor é: " + smallestValue);
    }
}
