/**
 * Lab04c assignment
 *
 * @author Berk Cakar // 22003021
 * @version 08.11.2020
 */
public class Lab04c {
    public static void main(String[] args) {
        // Variables
        double d;

        // Program Code

        /*
         * I would expect Java to print 0.9 in d != 1 condition. Since, computers use a
         * format that cannot accurately represent a number like 0.1, 0.2 or 0.3; they
         * represent a number very near to 0.1 like 0.99999. Thus, d never gets to 1 and
         * program loops to forever in d != 1 condition.
         *
         * Similar thing happens in d < 1 condition too. Before the last step of loop d
         * equals go 0.9999, so it loops for one more time and d gets 1.09999
         */
        d = 0.1;

        while (d < 1) {
            System.out.println(d);
            d = d + 0.1;
        }

        System.out.println(d + " <- final value after loop!");
    }
}
