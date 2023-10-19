

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(list);
        
        System.out.println("Shuffled Array: " + list);

        // 2. Enter a Roman Number as input and convert it to an integer.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanInput = scanner.nextLine().toUpperCase();
        int romanToInteger = romanToInteger(romanInput);
        
        if (romanToInteger != -1) {
            System.out.println("Roman to Integer: " + romanToInteger);
        } else {
            System.out.println("Invalid Roman numeral.");
        }

        // 3. Check if the input is a pangram or not.
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toUpperCase();
        boolean isPangram = isPangram(sentence);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to convert a Roman numeral to an integer.
    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanValue(s.charAt(i));
            
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            
            prevValue = value;
        }

        return result;
    }

    // Function to get the integer value of a Roman numeral character.
    public static int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1; // Invalid Roman numeral
        }
    }

    // Function to check if a sentence is a pangram.
    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet[c - 'A'] = true;
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




