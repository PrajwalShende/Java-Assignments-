// Q3:Write a Java Program to count the number of words in a string using HashMap.


import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String inputString = "Hi! My name is Prajwal and I like to code. Nice to meet you.";

        // Remove punctuation marks and split the string into words
        String[] words = inputString.split("\\s+");

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print the word count
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
