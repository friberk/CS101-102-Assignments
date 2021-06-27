import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Text analyser
 * 
 * @author Berk Cakar // 22003021
 * @version 22.12.2020
 */
public class Lab08c {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        File file = new File("text.txt");
        Scanner reader = new Scanner(file);

        // Constants

        // Variables
        ArrayList<String> text;
        ArrayList<Integer> wordLengths;

        int i;
        int j;
        int lengthCounter;
        int max;
        int mostRepeatedTimes;
        int mostRepeated;

        String temp;

        // Program Code

        text = new ArrayList<String>();
        wordLengths = new ArrayList<Integer>();

        // Read the words from the file
        while (reader.hasNext()) {
            text.add(reader.next());
        }

        // Remove unnecessary characters
        for (i = 1; i <= text.size(); i = i + 1) {
            for (j = 1, temp = ""; j <= text.get(i - 1).length(); j = j + 1) {

                if (Character.isLetterOrDigit(text.get(i - 1).charAt(j - 1))) {
                    temp = temp + text.get(i - 1).charAt(j - 1);
                }

                else {
                    temp = temp + "";
                }

            }

            text.set(i - 1, temp);
        }

        // Putting the word lengths of the words in "text" to another array.
        for (i = 1; i <= text.size(); i = i + 1) {
            wordLengths.add(text.get(i - 1).length());
            Collections.sort(wordLengths);
        }

        // Find the Max value in wordLengths
        max = 0;

        for (i = 1; i <= wordLengths.size() - 1; i = i + 1)
            ;
        {
            if (wordLengths.get(i - 1) > max) {
                max = wordLengths.get(i - 1);
            }
        }

        // Length and count number analysis. x words of length y

        mostRepeatedTimes = 0;
        mostRepeated = 0;

        for (i = 1; i <= max; i = i + 1) {
            lengthCounter = 0;

            for (j = 1; j <= wordLengths.size(); j = j + 1) {
                if (wordLengths.get(j - 1) == i) {
                    lengthCounter = lengthCounter + 1;
                }

                else if (lengthCounter > mostRepeatedTimes) {
                    mostRepeatedTimes = lengthCounter;
                    mostRepeated = i;
                }

            }

            System.out.print(lengthCounter + " words of length " + i + ", ");
        }

        System.out.println("\n\nThe longest word has length " + max + ".");

        System.out.println("\nThe most frequently occurring word length is " + mostRepeated + "," + " which occurs "
                + mostRepeatedTimes + " times.");

        scan.close();
        reader.close();
    }
}
