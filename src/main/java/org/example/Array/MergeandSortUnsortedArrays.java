package org.example.Array;

import java.util.Arrays;

public class MergeandSortUnsortedArrays {

    public static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        // Step 1: Create a new array of size equal to the sum of both input arrays
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Step 2: Copy elements of both arrays into the mergedArray
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        // Step 3: Sort the mergedArray
        Arrays.sort(mergedArray);

        // Return the sorted merged array
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4};
        int[] arr2 = {5, 2, 8, 6};
        int[] result = mergeAndSortArrays(arr1, arr2);
        System.out.println("Merged and Sorted Array: " + Arrays.toString(result));
    }
}
