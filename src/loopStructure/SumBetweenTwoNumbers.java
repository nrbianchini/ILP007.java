package loopStructure;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois valores: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum = 0;

        for (int i = number1; i <= number2; i++) {
            sum += i;
        }

        System.out.println("A soma dos números no intervalo de " +  number1 + " e " + number2 + " é: " + sum);
        }
    }
