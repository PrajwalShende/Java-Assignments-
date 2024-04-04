// Q4:Write a Java Program to find the duplicate characters in a string.


import java.util.HashMap;

public class DuplicateCharactersFinder {
    public static void main(String[] args) {
        String inputString = "Java programming";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : inputString.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }
}
