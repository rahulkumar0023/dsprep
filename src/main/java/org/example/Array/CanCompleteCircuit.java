package org.example.Array;

public class CanCompleteCircuit {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int start = 0;
        int currentGas = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                // Cannot reach the next station from the current start
                start = i + 1;
                currentGas = 0;
            }
        }

        // If the total amount of gas is enough for the total cost, return start
        // Otherwise, return -1
        return totalGas >= totalCost ? start : -1;
    }

    public static void main(String[] args) {
        CanCompleteCircuit solution = new CanCompleteCircuit();

        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        System.out.println(solution.canCompleteCircuit(gas1, cost1)); // Output: 3

        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        System.out.println(solution.canCompleteCircuit(gas2, cost2)); // Output: -1
    }

}
