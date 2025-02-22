package loopStructure;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double biggestPrice = 0;
        int expensiveCode = 0;
        double sumPrices = 0;

        for (int i = 1; i <= 15; i++){
            System.out.print("Produto " + i + " - Código: ");
            int code = input.nextInt();
            System.out.print("Produto " + i + " - Preço: ");
            double value = input.nextDouble();

            if (value > biggestPrice){
                biggestPrice = value;
                expensiveCode = code;
            }
            sumPrices += value;
        }
        System.out.printf("O maior preço é R$%.2f do produto código %d.%n", biggestPrice, expensiveCode);
        System.out.printf("A média dos preços dos produtos é: R$%.2f.%n", sumPrices/15);
    }
}
