package selectionStructure;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o valor total da compra: R$");
        double totalValue = input.nextDouble();
        System.out.printf("Selecione uma categoria:%n(1) - Cliente comum.%n(2) - Funcionário.%n(3) - VIP.%n");
        int code = input.nextInt();

        double discount = 0;

        switch(code) {
            case 1:
                discount = 0.0;
                break;
            case 2:
                discount = 0.10;
                break;
            case 3:
                discount = 0.05;
                break;
            default:
                System.out.print("Código inválido.");
                break;
        }

        double finalValue = totalValue * (1 - discount);
        System.out.printf("%nValor total a ser pago: R$%.2f%n", finalValue);

        input.close();
    }
}
