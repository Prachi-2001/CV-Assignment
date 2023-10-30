import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter roman number");
		    String romanNumeral = myObj.nextLine();  // Read user input
            myObj.close();
        int integerVal = romanToInteger(romanNumeral);
        System.out.println("Integer Value: " + integerVal);
    }

    public static int romanToInteger(String roman) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int total = 0;        // This variable will store the final integer value of the Roman numeral.
        int prevValue = 0;    // This variable keeps track of the previous Roman numeral value.

        // Loop through the Roman numeral string in reverse order.
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = romanNumerals.get(roman.charAt(i)); // Get the integer value of the current Roman numeral.

            // Check if the current value is less than the previous value. If so, subtract it; otherwise, add it.
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value; // Update the previous value for the next iteration.
        }

        return total; // Return the final integer value of the Roman numeral.
    }
}