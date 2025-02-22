package selectionStructure;

import java.util.Scanner;

public class StudentGradeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a nota da 1ª e 2ª avaliação do aluno: ");
        double exam1 = input.nextDouble();
        double exam2 = input.nextDouble();

        double mean = (exam1 + exam2) / 2;

        if (mean < 6){
            System.out.printf("Aluno reprovado.%nMédia: " + mean);
        }
        else {
            System.out.printf("Aluno aprovado.%nMédia: " + mean);
        }
    }
}
