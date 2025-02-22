package vector;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        int arrayCopy[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um valor inteiro: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
            }
        System.out.println(Arrays.toString(arrayCopy));
        }
    }
