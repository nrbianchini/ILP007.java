package selectionStructure;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira dois números inteiros: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println("Iguais.");
        }
        else {
            System.out.println("Diferentes.");
        }
    }
}
