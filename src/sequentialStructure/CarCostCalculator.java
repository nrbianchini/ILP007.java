package sequentialStructure;

import java.util.Scanner;

public class CarCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o custo de fábrica do veículo: R$");
        double factoryCost = input.nextDouble();

        double percentageTD = (factoryCost * 0.28) +  (factoryCost * 0.45);
        System.out.println("O custo final ao consumidor é de: R$" + (factoryCost + percentageTD));
    }
}
