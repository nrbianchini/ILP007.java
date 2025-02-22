package sequentialStructure;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a medida em polegadas: ");
        double inches =  input.nextDouble();
        System.out.print("A medida em centímetros é: " + (inches * 2.54));
    }
}
