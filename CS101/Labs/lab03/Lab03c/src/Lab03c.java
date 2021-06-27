import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

/**
 * HTML Webpage Generator for Employees
 *
 * @author Berk Cakar // ID No: 22003021
 * @version 05.11.2020
 */

public class Lab03c {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner titleInput = new Scanner(System.in);
        Scanner nameInput = new Scanner(System.in);
        Scanner ageInput = new Scanner(System.in);
        Scanner salaryInput = new Scanner(System.in);
        Scanner commentsInput = new Scanner(System.in);
        PrintStream originalStdOut = System.out;

        // Constants
        final String DOC_TYPE = "<!DOCTYPE html>";
        final String HTML_TAG = "<html>";
        final String HTML_TAG_CLOSE = "</html>";
        final String HEAD_TAG = "<head>";
        final String HEAD_TAG_CLOSE = "</head>";
        final String TITLE_TAG = "<title>";
        final String TITLE_TAG_CLOSE = "</title>";
        final String BODY_TAG = "<body>";
        final String BODY_TAG_CLOSE = "</body>";
        final String HR_TAG = "<hr>";
        final String HR_TAG_CLOSE = "</hr>";
        final String H1_TAG = "<h1>";
        final String H1_TAG_CLOSE = "</h1>";
        final String P_TAG = "<p>";
        final String P_TAG_CLOSE = "</p>";

        // Variables
        String title;
        String name;
        int age;
        double salary;
        String comments;

        // Program Code
        // I commented out println's because David hoca wants just html code in "temp.htm"
        System.out.println("Welcome to Employee Webpage Generator!");
        System.out.println("If you want to use your photo on WebPage, please locate it in /src folder and name it \"myimg.jpg\"");
        System.out.println("If you don't want to use your photo, then continue.");
        System.out.print("Please write a title for your webpage: ");
        title = titleInput.nextLine();
        System.out.print("Please enter your name: ");
        name = nameInput.nextLine();
        System.out.print("Please enter your age: ");
        age = ageInput.nextInt();

        if (age < 0) {
            System.out.println("Your age cannot be negative. Program exiting");
            return;
        }

        System.out.print("Please enter your salary: ");
        salary = salaryInput.nextDouble();

        if (salary > 10000) {
            System.out.println("Your salary cannot be bigger than 10000. Program exiting");
            return;
        }

        if (salary <= 1000) {
            salary = (((salary) - 100) / 100) * 95;
        }

        if (salary >= 5000) {
            salary = (((salary) - 100) / 100) * 75;
        }

        if (salary > 1000 & salary < 5000) {
            salary = (((salary) - 100) / 100) * 85;
        }

        System.out.print("Write other things that you want it to be displayed on your webpage: ");
        comments = commentsInput.nextLine();

        System.setOut(new PrintStream("src/webpage.htm"));

        System.out.println(DOC_TYPE +

                "\n" + "\n" + HTML_TAG +

                "\n" + "\n" + HEAD_TAG + "\n" + TITLE_TAG + title + TITLE_TAG_CLOSE + "\n" + HEAD_TAG_CLOSE +

                "\n" + "\n" + BODY_TAG +

                "\n" + "\n" + HR_TAG);

        File f = new File("src/myimg.jpg");
        if (f.exists() && !f.isDirectory()) {
            System.out.println("\n" + "<img src=myimg.jpg>");
        }

        System.out.println("\n" + H1_TAG + name + H1_TAG_CLOSE + "\n" + P_TAG + "Age: " + age + P_TAG_CLOSE + "\n"
                + P_TAG + "Salary: " + salary + P_TAG_CLOSE + "\n" + P_TAG + "Comments: " + comments + P_TAG_CLOSE
                + "\n" + HR_TAG_CLOSE +

                "\n" + "\n" + BODY_TAG_CLOSE +

                "\n" + "\n" + HTML_TAG_CLOSE);
        System.out.close();
        System.setOut(originalStdOut);
        System.out.println("Webpage created.");

        titleInput.close();
        nameInput.close();
        ageInput.close();
        salaryInput.close();
        commentsInput.close();
    }
}
