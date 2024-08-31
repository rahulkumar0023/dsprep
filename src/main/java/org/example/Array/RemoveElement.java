package org.example.Array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
         // Number of elements not equal to val
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer++] = nums[i];
            }
        }
        return pointer;

    }
    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Output: " + k1 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, k1)));

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("Output: " + k2 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, k2)));
    }

}
