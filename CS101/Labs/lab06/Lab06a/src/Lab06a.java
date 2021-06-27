import java.util.Scanner;

/**
 * Writing methods for Lab06 and demonstrating them.
 * 
 * @author Berk Cakar // 22003021
 * @version 02.12.2020
 */
public class Lab06a {
    /**
     * This method calculates x to the power of y.
     * 
     * @param x base value
     * @param y power value (y > 0)
     * @return x ^ y
     */
    public static double power(double x, int y) {
        double result;
        result = 1;

        for (int i = 1; i <= y; i = i + 1) {
            result = result * x;
        }

        return result;
    }

    /**
     * This method calculates the product of numbers from 1 to n. According to what
     * the lab assignment says, this method should return a int value; but when it
     * is an int, after 13! "result" overflows and gives wrong results. So, I had to
     * convert it to long.
     * 
     * @param n the number to multiply from one to itself.
     * @return n! (n factorial)
     */
    public static long factorial(int n) {
        long result;
        result = 1;

        for (int i = 1; i <= n; i = i + 1) {
            result = result * i;
        }

        return result;
    }

    /**
     * This method reverses the strings.
     * 
     * @param x string to be reversed
     * @return reversed string (gnirts desrever)
     */
    public static String reverse(String x) {
        String reversedString;
        int stringLength;

        reversedString = "";

        stringLength = x.length();

        for (int i = stringLength; i >= 1; i = i - 1) {
            reversedString = reversedString + x.charAt(i - 1);
        }

        return reversedString;
    }

    /**
     * This method converts decimals to base 2.
     * 
     * @param base2 the string value that will be converted to base2 binary.
     * @return rewritten version of the given String in base2.
     */
    public static int toDecimal(String base2) {
        boolean base2Check;

        int digit;
        int result;

        result = 0;
        digit = 0;
        base2Check = true;

        for (int i = 1; i <= base2.length(); i = i + 1) {
            // Checking if all numbers in base are 0 or 1. If not returns 0.
            if (base2.charAt(i - 1) != '0' && base2.charAt(i - 1) != '1') {
                base2Check = false;
            }
        }

        if (base2Check == true) {
            for (int i = 1, powerTwo = 1; i <= base2.length(); i = i + 1)

            {
                digit = Integer.parseInt(String.valueOf(base2.charAt(i - 1)));

                for (int j = 1; j <= base2.length() - i; j = j + 1) {
                    powerTwo = powerTwo * 2;
                }

                result = result + (digit * powerTwo);

                powerTwo = 1;
            }
        }

        return result;
    }

    /**
     * This method converts base10 values to binary.
     * 
     * @param base10 the value that will be converted to binary.
     * @return rewritten version of the given int value in binary.
     */
    public static String toBinary(int base10) {
        String result;
        result = "";

        while (base10 > 0) {
            result = (base10 % 2) + result;
            base10 = base10 / 2;
        }

        return result;
    }

    /**
     * This method calculates sin(x) still using the Taylor series, but in a
     * different way.
     * 
     * @param x degree of sin(x).
     * @return sin(x) value.
     */
    public static double sin(double x) {
        double xRadians;
        double result;
        int power;
        int factorial;

        xRadians = x * (2 * Math.PI / 360);

        result = 0;
        power = 1;
        factorial = 1;

        for (int i = 0; i <= 10; i = i + 1) {
            if (i % 2 == 0) {
                result = result + ((power(xRadians, power)) / factorial(factorial));

                power = power + 2;
                factorial = factorial + 2;
            }

            else {
                result = result - ((power(xRadians, power)) / factorial(factorial));

                power = power + 2;
                factorial = factorial + 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        int i;
        int j;

        int firstNumber;

        String firstBinary;
        String secondBinary;

        String toBeReversed;

        double number;
        double numberRadian;
        double taylorTerm;
        double taylorResult;

        String sinMethodDegree;

        // Program Code
        // First demonstration.
        System.out.println("\nTable with columns n, n-squared, n-cubed & n to the power 4, "
                + "for values of n from -1 to 10 inclusive");

        System.out.printf("%8s %8s %8s %8s %n", "n", "n^2", "n^3", "n^4");

        for (i = -1; i <= 10; i = i + 1) {
            for (j = 1; j <= 4; j = j + 1) {
                System.out.printf("%8.0f", power(i, j));
            }

            System.out.println();
        }

        // Second demonstration.
        System.out.println("\nTable for factorials 1 to 15.");

        firstNumber = 1;

        for (i = 1; i <= 3; i = i + 1) {
            for (j = 1; j <= 5; j = j + 1) {
                System.out.printf("%20s", firstNumber + "! = " + factorial(firstNumber));

                if (j < 5) {
                    System.out.print(",");
                }

                firstNumber = firstNumber + 1;
            }

            System.out.println();
        }

        // Third demonstration.
        System.out.print("\nPlease enter your first base-2 binary number: ");
        firstBinary = scan.nextLine();

        System.out.print("Please enter your second base-2 binary number: ");
        secondBinary = scan.nextLine();

        /*
         * Converting these two binaries to decimals and after calculating their sum
         * converting to binary again.
         */
        System.out.println("Sum of these two binaries as a base-2 binary is "
                + toBinary(toDecimal(firstBinary) + toDecimal(secondBinary)));

        // Fourth demonstration.
        System.out.print("\nWelcome to String reverser! Please type in your word(s): ");
        toBeReversed = scan.nextLine();

        System.out.println("Your reversed string is: " + reverse(toBeReversed));

        // Fifth demonstration.
        System.out
                .println("\nWelcome to sin(x) calculator!" + "\nThis calculator uses Taylor series to compute sin(x).");

        System.out.print("Please enter a x value (in degrees): ");
        number = scan.nextDouble();

        numberRadian = number * (2 * Math.PI / 360);

        // Printing out the head line of the table.
        System.out.printf("%n %2s %10s %21s %24s %20s %20s %n %n", "n", "(-1)^n", "x^(2n+1)", "(2n+1)!", "Current Term",
                "Total Sum");

        taylorResult = 0;

        for (i = 0; i <= 10; i = i + 1) {
            // Calculating the current term of the series.
            taylorTerm = power(-1, i) / factorial((2 * i) + 1) * power(numberRadian, (2 * i) + 1);

            // Calculating the Taylor sum.
            taylorResult = taylorResult + taylorTerm;

            // Printing out the row that includes elements of the Taylor series.
            System.out.printf("%3d %10.1f %20.5f %25d %20.5f %20.5f %n", i, power(-1, i),
                    power(numberRadian, (2 * i) + 1), factorial((2 * i) + 1), taylorTerm, taylorResult);
        }

        // Printing out the sin(x) and its value for one more time.
        System.out.printf("%n %3s %.10f %n", "sin(" + number + ") equals to ", taylorResult);

        // Sixth Demonstration

        do {
            System.out.println("\nType q to quit.");
            System.out.print("Please enter a x value (in degrees): ");
            sinMethodDegree = scan.next();

            if (!(sinMethodDegree.equals("q"))) {
                number = Double.parseDouble(sinMethodDegree);

                System.out.println("\nMy method has calculated sin(" + number + ") as: " + sin(number));
                System.out.println("Java's Math.sin method has calculated sin(" + number + ") as: "
                        + Math.sin(number * (2 * Math.PI / 360)));
                System.out.printf("%s %.16f %n", "The difference between them is:",
                        Math.abs(sin(number) - Math.sin(number * (2 * Math.PI / 360))));
            }
        } while (!(sinMethodDegree.equalsIgnoreCase("q")));

        scan.close();
    }
}
