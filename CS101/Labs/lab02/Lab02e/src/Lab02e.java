import java.util.Scanner;

/**
 * HTML Webpage Generator for Employees
 *
 * @author Berk Cakar // ID No: 22003021
 * @version 30.10.2020
 */

public class Lab02e {
    public static void main(String[] args) {
        Scanner titleInput = new Scanner(System.in);
        Scanner nameInput = new Scanner(System.in);
        Scanner ageInput = new Scanner(System.in);
        Scanner salaryInput = new Scanner(System.in);
        Scanner commentsInput = new Scanner(System.in);

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

        String webPageOutput;

        // Program Code
        // I commented out println's because David hoca wants just html code in "temp.htm"
        System.out.println("Welcome to Employee Webpage Generator!");
        System.out.print("Please write a title for your webpage: ");
        title = titleInput.nextLine();
        System.out.print("Please enter your name: ");
        name = nameInput.nextLine();
        System.out.print("Please enter your age: ");
        age = ageInput.nextInt();
        System.out.print("Please enter your salary: ");
        salary = salaryInput.nextDouble();
        System.out.print("Write other things that you want it to be displayed on your webpage: ");
        comments = commentsInput.nextLine();

        webPageOutput = (DOC_TYPE +

                "\n" + "\n" + HTML_TAG +

                "\n" + "\n" + HEAD_TAG + "\n" + TITLE_TAG + title + TITLE_TAG_CLOSE + "\n" + HEAD_TAG_CLOSE +

                "\n" + "\n" + BODY_TAG +

                "\n" + "\n" + HR_TAG + "\n" + H1_TAG + name + H1_TAG_CLOSE + "\n" + P_TAG + "Age: " + age + P_TAG_CLOSE
                + "\n" + P_TAG + "Salary: " + salary + P_TAG_CLOSE + "\n" + P_TAG + "Comments: " + comments
                + P_TAG_CLOSE + "\n" + HR_TAG_CLOSE +

                "\n" + "\n" + BODY_TAG_CLOSE +

                "\n" + "\n" + HTML_TAG_CLOSE);

        System.out.println(webPageOutput);

        titleInput.close();
        nameInput.close();
        ageInput.close();
        salaryInput.close();
        commentsInput.close();
    }
}
