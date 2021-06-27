import java.util.Scanner;

/**
 * Lab02a.5 warm-up exercise
 *
 * @author Berk Cakar // 22003021
 * @version 30.10.2020
 */
public class Lab02a_5 {
    public static void main(String[] args) {
        Scanner yournameInput = new Scanner(System.in);

        // Constants

        // Variables
        String yourname;

        // Program Code
        System.out.print("Please enter your name: ");
        yourname = yournameInput.next();

        System.out.println("Hello " + yourname + ", welcome to Java!");

        yournameInput.close();
    }
}
