
//C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the sentence: ");
        String inputSentence = myObj.nextLine(); // Read user
        myObj.close();
        if (isPangram(inputSentence)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        // Convert the sentence to lowercase to handle both uppercase and lowercase
        // letters.
        sentence = sentence.toLowerCase();

        for (char c : sentence.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}