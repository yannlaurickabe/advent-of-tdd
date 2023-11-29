package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    public void addCalories(int caloriesToAdd) {
        totalCalories += caloriesToAdd;
    }

    @Override
    public int compareTo(Elf other) {
        if (totalCalories > other.getTotalCalories()) 
            return 1;
        else if (totalCalories < other.getTotalCalories())
            return -1;
        else return 0;
    }
}
