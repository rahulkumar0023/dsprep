package org.example.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Frequency array for each character ('a' to 'z')
        int[] magazineCounts = new int[26];

        // Count the frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            magazineCounts[c - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            // Decrement the count for each character in ransomNote
            magazineCounts[c - 'a']--;

            // If at any point the count goes negative, return false
            if (magazineCounts[c - 'a'] < 0) {
                return false;
            }
        }

        return true; // All characters needed were found in sufficient quantity
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
      //  System.out.println(solution.canConstruct("a", "b"));   // Output: false
      //  System.out.println(solution.canConstruct("aa", "ab")); // Output: false
        System.out.println(solution.canConstruct("aa", "aab")); // Output: true
    }
}
