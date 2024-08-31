package org.example.Array;

//Question:
//
//Given an unsorted array of positive integers and a target sum, write a program to find a contiguous subarray within the array that sums up to the given target sum. If there are multiple such subarrays, return the first one found. If no such subarray exists, return an indication that it doesn't exist.
//
//Example:
//
//Input: arr = [1, 4, 20, 3, 10, 5], target_sum = 33
//
//Output: [20, 3, 10]
//
//Input: arr = [1, 2, 3, 7, 5], target_sum = 12
//
//Output: [2, 3, 7]
//
//Input: arr = [1, 4, 20, 3, 10, 5], target_sum = 100
//
//Output: "No subarray found"

public class ContiguousSubArray {


    public static int[] findSubarrayWithGivenSum(int[] arr, int targetSum) {
        int currentSum = arr[0];
        int start = 0;

        for (int i = 1; i < arr.length; i++) {
            while (currentSum > targetSum && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }

            // If currentSum equals targetSum, return the subarray
            if (currentSum == targetSum) {
                return java.util.Arrays.copyOfRange(arr, start, i);
            }
            // Add the current element to currentSum
            if (i < arr.length) {
                currentSum += arr[i];
            }
        }

        // If no subarray is found, return an indication (e.g., an empty array or a message)
        return new int[0]; // Indicating no subarray found
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 4, 20, 3, 10, 5};
        int targetSum1 = 33;
        int[] result1 = findSubarrayWithGivenSum(arr1, targetSum1);
        if (result1.length > 0) {
            System.out.println("Subarray with given sum: " + java.util.Arrays.toString(result1));
        } else {
            System.out.println("No subarray found with the given sum.");
        }

        int[] arr2 = {1, 2, 3, 7, 5};
        int targetSum2 = 12;
        int[] result2 = findSubarrayWithGivenSum(arr2, targetSum2);
        if (result2.length > 0) {
            System.out.println("Subarray with given sum: " + java.util.Arrays.toString(result2));
        } else {
            System.out.println("No subarray found with the given sum.");
        }
    }
}
