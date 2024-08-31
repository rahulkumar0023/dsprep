package org.example.Array;

import java.util.HashMap;

public class MajorityElement {
    private int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length/2) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        MajorityElement solution = new MajorityElement();

        int[] nums = {3, 2, 3};
        System.out.println("Majority Element: " + solution.majorityElement(nums)); // Output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + solution.majorityElement(nums2)); // Output: 2
    }


}
