package org.example.Array;
import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        // Step 1: Sort the citations in descending order
        Arrays.sort(citations);

        int n = citations.length;
        for (int i = 0; i < n; i++) {
            // Check if the number of citations is greater than or equal to the current index + 1
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        HIndex solution = new HIndex();

        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println("H-Index: " + solution.hIndex(citations1)); // Output: 3

        int[] citations2 = {1, 3, 1};
        System.out.println("H-Index: " + solution.hIndex(citations2)); // Output: 1
    }
}
