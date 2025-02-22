package sequentialStructure;

import java.util.Scanner;

public class PredecessorAndSuccessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        number = input.nextInt();
        System.out.printf("Predecessor: " + (number-1) + "%nSucessor: " + (number+1));
    }
}