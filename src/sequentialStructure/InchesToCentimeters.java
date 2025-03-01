/* Reads a measurement in inches and prints out the equivalent in centimeters, 
   knowing that 2.54 cm equals 1 inch. */

package sequentialStructure;
import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the measurement in inches: ");
        double inches =  input.nextDouble();
        System.out.print("The measurement in centimeters is: " + (inches * 2.54));
    }
}
