package RFC3280;

import java.io.InputStream;
import java.util.HashMap;

public class RFC3280 {

    public static void main(String[] args) {

        // Create HashMap to store words
        HashMap<String ,Integer> nineLetterWords =new HashMap<String,Integer>();

        // Create File Object
        InputStream file = RFC3280.class.getResourceAsStream("/RFC3280/RFC3280.txt");

        // Scanner to read in file
        java.util.Scanner scanner = new java.util.Scanner(file);

        // Search for the most common 9 letter word
        while (scanner.hasNext()) {
            String word = scanner.next();

            // Get rid of special characters
            word = word.replaceAll("[^a-zA-Z\\d\\s+]", "");

            // Check for 9 letter words
            if (word.length() == 9) {

                // Add word to HashMap
                if (nineLetterWords.containsKey(word)) {
                    nineLetterWords.put(word, nineLetterWords.get(word) + 1);
                } else {
                    // Increase value of word by 1 if it already exists
                    nineLetterWords.put(word, 1);
                }

            }
        }
        // Find the most common 9 letter word
        int max = 0;
        String mostCommon = "";
        for (String key : nineLetterWords.keySet()) {
            if (nineLetterWords.get(key) > max) {
                max = nineLetterWords.get(key);
                mostCommon = key;
            }
        }
        System.out.println(nineLetterWords);
        System.out.println("\n" +
                "--------------------------------------------------" + "\n" +
                "The most common 9 letter word is: " + mostCommon + " : " + max + "\n" +
                "--------------------------------------------------" );
    }



}
