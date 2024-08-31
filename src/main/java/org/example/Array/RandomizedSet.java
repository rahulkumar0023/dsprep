package org.example.Array;
import java.util.Random;
import  java.util.*;

public class RandomizedSet {
    private Map<Integer, Integer> valueIndexMap;
    private List<Integer> values;
    private Random random;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        valueIndexMap = new HashMap<>();
        values = new ArrayList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (valueIndexMap.containsKey(val)) {
            return false;
        }
        valueIndexMap.put(val, values.size());
        values.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!valueIndexMap.containsKey(val)) {
            return false;
        }
        int index = valueIndexMap.get(val);
        int lastElement = values.get(values.size() - 1);

        // Move the last element to the place of the element to be removed
        values.set(index, lastElement);
        valueIndexMap.put(lastElement, index);

        // Remove the last element
        values.remove(values.size() - 1);
        valueIndexMap.remove(val);

        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return values.get(random.nextInt(values.size()));
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1)); // true
        System.out.println(randomizedSet.remove(2)); // false
        System.out.println(randomizedSet.insert(2)); // true
        System.out.println(randomizedSet.getRandom()); // 1 or 2
        System.out.println(randomizedSet.remove(1)); // true
        System.out.println(randomizedSet.insert(2)); // false
        System.out.println(randomizedSet.getRandom()); // 2
    }
}
