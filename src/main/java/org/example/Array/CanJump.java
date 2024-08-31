package org.example.Array;

public class CanJump {
    public int jump(int[] nums) {
        int jumps = 0;        // The number of jumps needed to reach the end
        int currentEnd = 0;   // The farthest index that can be reached with the current number of jumps
        int farthest = 0;     // The farthest index that can be reached with one more jump

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); // Update the farthest index reachable from the current position

            if (i == currentEnd) { // If you reach the end of the current jump range
                jumps++;           // Increment the jump count
                currentEnd = farthest; // Update the end of the current jump range
            }
        }

        return jumps; // Return the minimum number of jumps to reach the last index
    }

    public static void main(String[] args) {
        CanJump solution = new CanJump();

        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Minimum Jumps: " + solution.jump(nums1)); // Output: 2

        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println("Minimum Jumps: " + solution.jump(nums2)); // Output: 2
    }
}
