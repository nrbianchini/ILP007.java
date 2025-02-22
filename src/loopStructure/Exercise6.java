package loopStructure;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial = 1;
        System.out.print("Insira um número inteiro e positivo: ");
        int number = input.nextInt();

        for (int i = number; i >= 1; i--){
            fatorial *= i;
        }
        System.out.print(fatorial);
    }
}

