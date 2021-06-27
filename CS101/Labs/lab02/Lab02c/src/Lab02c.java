import java.util.Scanner;

/**
 * Lab02c assignment
 *
 * @author Berk Cakar // 22003021
 * @version 30.10.2020
 */

public class Lab02c {
    public static void main(String[] args) {
        Scanner firstNumberInput = new Scanner(System.in);
        Scanner secondNumberInput = new Scanner(System.in);

        // Constants

        // Variables
        double firstNumber;
        double secondNumber;

        // Program Code
        System.out.print("Please enter the first number: ");
        firstNumber = firstNumberInput.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = secondNumberInput.nextInt();

        System.out.println("Their sum = " + (firstNumber + secondNumber) + "\n" + "Their difference = "
                + (firstNumber - secondNumber) + "\n" + "Their product = " + (firstNumber * secondNumber) + "\n"
                + "Their division = " + (firstNumber / secondNumber) + "\n" + "Their reminder after division = "
                + ((firstNumber / secondNumber) - (int) (firstNumber / secondNumber)) + "\n" + "The bigger one is = "
                + Math.max(firstNumber, secondNumber) + "\n" + "The smaller one is = "
                + Math.min(firstNumber, secondNumber));

        firstNumberInput.close();
        secondNumberInput.close();
    }
}
