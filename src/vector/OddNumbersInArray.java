package vector;

import java.util.Scanner;

public class OddNumbersInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];

        System.out.println("Insira 10 valores inteiros.");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }
}
