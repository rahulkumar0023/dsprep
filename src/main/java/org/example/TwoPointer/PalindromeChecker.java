package org.example.TwoPointer;

public class PalindromeChecker {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and filter out non-alphanumeric characters
        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }

        // Use two pointers to check if the string is a palindrome
        int left = 0;
        int right = filteredString.length() - 1;
        while (left < right) {
            if (filteredString.charAt(left) != filteredString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        System.out.println(checker.isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(checker.isPalindrome("race a car"));                     // Output: false
        System.out.println(checker.isPalindrome(" "));                              // Output: true
    }
}
