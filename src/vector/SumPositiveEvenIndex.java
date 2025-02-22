package vector;

import java.util.Scanner;

public class SumPositiveEvenIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um valor: ");
            array[i] = input.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && i % 2 == 0) {
                sum+= array[i];
            }
        }
        System.out.println(sum);
    }
}
