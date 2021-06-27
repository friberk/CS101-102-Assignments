import java.util.Scanner;

/**
 * Lab02a.3 warm-up exercise
 *
 * @author Berk Cakar // 22003021
 * @version 30.10.2020
 */
public class Lab02a_3 {
    public static void main(String[] args) {
        Scanner yournameInput = new Scanner(System.in);

        // Constants
        final String YOUR_NAME = "Berk";

        // Variables

        // Program Code
        System.out.println("Hello " + YOUR_NAME + ", welcome to Java!");

        System.out.print("I'm trying to change \"yourname\" constant.");
        YOUR_NAME = yournameInput.next();

        yournameInput.close();
    }
}
