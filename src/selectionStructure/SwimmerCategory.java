package selectionStructure;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a idade: ");
        int age = input.nextInt();

        if (age >= 5 && age <= 7) {
            System.out.print("Infantil A");
        }
        else if (age >= 8 && age <= 10) {
            System.out.print("Infantil B");
        }
        else if (age >= 11 && age <= 13) {
            System.out.print("Juvenil A");
        }
        else if (age >= 14 && age <= 17) {
            System.out.print("Juvenil B");
        }
        else if (age >= 18) {
            System.out.print("Adulto");
        }
    }
}
