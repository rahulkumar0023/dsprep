package org.example.Array;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // k = 3
        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        //{1, 2, 3, 4, 5, 6, 7}; => {7,6,5,4,3,2,1};
        reverse(nums, 0, k - 1);
        //{7,6,5,4,3,2,1}; => {5,6,7,4,3,2,1};
        reverse(nums, k, n - 1);
        //{5,6,7,4,3,2,1}; => {5,6,7,1,2,3,4};
    }

    // Helper function to reverse elements in the array from start to end indices
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Rotate solution = new Rotate();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        System.out.println("Rotated Array: " + java.util.Arrays.toString(nums1));

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        System.out.println("Rotated Array: " + java.util.Arrays.toString(nums2));
    }
}
