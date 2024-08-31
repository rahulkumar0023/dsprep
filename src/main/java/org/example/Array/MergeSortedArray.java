package org.example.Array;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int finalP = m + n - 1;

        while (pointer1 >= 0 && pointer2 >= 0) {
            if (nums1[pointer1] > nums2[pointer2]) {
                nums1[finalP] = nums1[pointer1];
                pointer1--;
            }else {
                nums1[finalP] = nums2[pointer2];
                pointer2--;
            }
            finalP--;
        }
        while (pointer2 >= 0) {
            nums1[finalP] = nums2[pointer2];
            pointer2--;
            finalP--;
        }

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + java.util.Arrays.toString(nums1));
    }
}
