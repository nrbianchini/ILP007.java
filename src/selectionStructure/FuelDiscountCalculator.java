package selectionStructure;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o número de litros vendidos: ");
        int liters = input.nextInt();
        System.out.printf("Selecione o tipo de combustível:%n1 - Álcool.%n2 - Gasolina.%n");
        int fuelType = input.nextInt();

        switch (fuelType) {
            case 1:
                System.out.print("Valor a ser pago: R$" + (liters * 2.9));
                break;
            case 2:
                System.out.print("Valor a ser pago: R$" + (liters * 3.3));
                break;
        }
    }
}
