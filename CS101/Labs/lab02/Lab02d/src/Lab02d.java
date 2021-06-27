import java.util.Scanner;

/**
 * A program that calculates maximum numbers of flowers which can be planted in
 * a triangle-shaped garden.
 *
 * @author Berk Cakar // ID No: 22003021
 * @version 26.10.2020
 */

public class Lab02d {
    public static void main(String[] args) {
        // Declaring inputs for side lengths' of the triangle.
        Scanner sideAInput = new Scanner(System.in);
        Scanner sideBInput = new Scanner(System.in);
        Scanner sideCInput = new Scanner(System.in);

        // Constants
        // Declaring the maximum number of flowers that can be planted per square meter.
        final int MAX_FLOWERS_PER_M2 = 17;

        // Variables
        // Declaring variables for side lengths' of the triangle.
        double sideA;
        double sideB;
        double sideC;

        // Declaring variables for area calculation.
        double s;
        double area;

        // Declaring a variable for the number of flowers that can be planted.
        double flowersCanBePlanted;

        // Program Code
        // Ask and get the side lengths' of the garden.
        System.out.println(
                "Welcome to the \"Maximum Number of Flowers That You Can Plant in Your Triangle-shaped Garden\" Calculator!");
        System.out.println("You can plant maximum " + MAX_FLOWERS_PER_M2 + " flowers per square meter.");

        System.out.print("Please enter first side length of your triangle-shaped garden (in meters): ");
        sideA = sideAInput.nextDouble();
        System.out.print("Please enter second side length of the triangle-shaped garden (in meters): ");
        sideB = sideBInput.nextDouble();
        System.out.print("Please enter third side length of the triangle-shaped garden (in meters): ");
        sideC = sideCInput.nextDouble();

        // Closes the program if one of the side lengths is negative.
        if (sideA < 0 || sideB < 0 || sideC < 0) {
            System.out.println("Side lengths cannot be negative. Program will be closed.");
            System.exit(0);
        }

        // Checks the triangle if it exists, if not closes the program
        else if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("A triangle with these side lengths does not exist. Program will be closed.");
            System.exit(0);
        }

        // Using Heron's formula to calculate area of the garden (triangle).
        s = (sideA + sideB + sideC) / 2;
        area = Math.sqrt((s) * (s - sideA) * (s - sideB) * (s - sideC));
        flowersCanBePlanted = MAX_FLOWERS_PER_M2 * area;

        /**
         * I used a simple trick to decide whether flowersCanBePlanted is a float value
         * or not. As far as we know all integer values equals to 0 in modulo 1. If our
         * variable equals to a different value than 0, then it is a float. Thus, it
         * should be converted to an integer value because it is not possible to plant
         * partial flowers.
         */
        if ((flowersCanBePlanted % 1) != 0) {
            System.out.println("Your garden's area with the side lengths " + sideA + ", " + sideB + ", " + sideC
                    + " is " + area + " square meter.");
            System.out.println("You are supposed to plant " + flowersCanBePlanted
                    + " flowers, but since you can't plant partial flowers");
            System.out.println((int) flowersCanBePlanted + " is the maximum number of flowers that you can plant."
                    + "\nwhich means you won't be able to plant " + (flowersCanBePlanted - (int) flowersCanBePlanted)
                    + " flowers.");
        }

        else {
            System.out.println("Your garden's area with the side lengths " + sideA + ", " + sideB + ", " + sideC
                    + " is " + (int) area + " square meter.");
            System.out.println((int) flowersCanBePlanted + " is the maximum number of flowers that you can plant.");
        }

        // Closing the inputs to prevent resource leak.
        sideAInput.close();
        sideBInput.close();
        sideCInput.close();
    }
}
