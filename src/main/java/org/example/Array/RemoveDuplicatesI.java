package org.example.Array;

import java.util.HashMap;

public class RemoveDuplicatesI {

    public int removeDuplicates(int[] nums) {
        int k = 2;  // Start from 2 as we allow at most two duplicates

        if (nums.length <= 2) {
            return nums.length;  // If the array has 2 or fewer elements, it is already valid
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        System.out.println(new RemoveDuplicatesI().removeDuplicates(nums1));
    }
}
