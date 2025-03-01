/* The cost of a new car to the consumer is the sum of the factory cost, the distributor's 
percentage, and the taxes (applied to the factory cost). Assuming the distributor's percentage 
is 28% and the taxes are 45%, write an algorithm to read the factory cost of a car, calculate, 
and print the final cost to the consumer. */

package sequentialStructure;

import java.util.Scanner;

public class CarCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the factory cost of the vehicle: R$");
        double factoryCost = input.nextDouble();

        double percentageTD = (factoryCost * 0.28) +  (factoryCost * 0.45);
        System.out.println("The final cost to the consumer is: R$" + (factoryCost + percentageTD));
    }
}
