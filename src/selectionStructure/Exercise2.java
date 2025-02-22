package selectionStructure;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o número de maçãs compradas: ");
        int applesQuantity = input.nextInt();

        if (applesQuantity < 12) {
            System.out.print("Custo total: R$" +  (applesQuantity * 1.30));
        }
        else {
            System.out.print("Custo total: R$" +  (applesQuantity));
        }
    }
}
