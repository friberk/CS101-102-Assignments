import java.util.Scanner;

/**
 * Lab03a assignment
 *
 * @author Berk Çakar // 22003021
 * @version 05.11.2020
 */
public class Lab03a {
    public static void main(String[] args) {

        Scanner numberInput = new Scanner(System.in);
        // Constants

        // Variables
        int odd = 0;
        int even = 0;
        int n;
        int sum = 0;
        int anotherSum;
        int y;

        // Program Code
        for (int x = 0; x <= 50; x++) {
            if (x < 12 | x > 25) {
                System.out.println("For " + x);
                System.out.println("Out of range 12-25 ");

                if (x % 5 == 0) {
                    System.out.println("Hi Five!");
                }

                if (x % 2 == 0) {
                    System.out.println("Hi Two!");
                }

                if (x % 3 == 0 | x % 7 == 0) {
                    System.out.println("Hi ThreeOrSeven!");
                }

                else {
                    System.out.println("Hi Others!");
                }

                System.out.println("******");
            }

            else {
                System.out.println("For " + x);

                if (x % 5 == 0) {
                    System.out.println("Hi Five!");
                }

                if (x % 2 == 0) {
                    System.out.println("Hi Two!");
                }

                if (x % 3 == 0 | x % 7 == 0) {
                    System.out.println("Hi ThreeOrSeven!");
                }

                else {
                    System.out.println("Hi Others!");
                }

                System.out.println("******");
            }
        }

        for (int x = 0; x <= 50; x++) {
            if (x % 2 == 0) {
                even++;
            }

            else {
                odd++;
            }
        }

        /*
         * for ( int x = 0; x <= 50; x++ ) { 
         *     if ( x % 5 == 0 ) {
         *         System.out.println("Hi Five!" + x); 
         *     }
         *
         *     if ( x % 2 == 0 ) { 
         *         System.out.println("Hi Two!" + x); 
         *     }
         *
         *     if ( x % 3 == 0 | x % 7 == 0 ) { 
         *         System.out.println("Hi ThreeOrSeven!"); 
         *     }
         *
         *     else { System.out.println("Hi Others!"); } }
         */

        System.out.println("Even number count = " + even);
        System.out.println("Odd number count = " + odd);

        System.out.println("1 to n Sum Calculator, enter a number: ");
        n = numberInput.nextInt();

        for (y = 1; y <= n; y++) {
            sum += y;
        }
        anotherSum = (n * (n + 1)) / 2;

        if (anotherSum == sum) {
            System.out.println("They are equal!");
            System.out.println(sum);
        }
        numberInput.close();
    }
}
