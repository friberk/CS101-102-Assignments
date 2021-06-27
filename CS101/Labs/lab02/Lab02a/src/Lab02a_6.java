import java.util.Scanner;

/**
 * Lab02a assignment
 *
 * @author Berk Cakar // ID No: 22003021
 * @version 26.10.2020
 */

public class Lab02a_6 {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        Scanner ageInput = new Scanner(System.in);

        // Constants

        // Variables
        // Declaring variables for answers of the questions, which are empty for now.
        String name;
        int age;

        // Program Code
        // 1. Asks user's name and then sets "name" string variable to user's name.
        System.out.print("What is your name?: ");
        name = nameInput.next();

        // 2. Asks user's age and then sets "age" integer variable to user's age.
        System.out.print("What is your age?: ");
        age = ageInput.nextInt();

        // 3. Prints out the user's name and age.
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        // 4. Closes the inputs to prevent resource leak.
        nameInput.close();
        ageInput.close();
    }
}
