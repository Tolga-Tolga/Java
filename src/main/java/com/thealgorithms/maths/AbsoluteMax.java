package com.thealgorithms.maths;

import java.util.Arrays;

public class AbsoluteMax {

    /**
     * Compares the numbers given as arguments to get the absolute max value.
     *
     * @param numbers The numbers to compare
     * @return The absolute max value
     */
    public static int getMaxValue(int... numbers) {
        if (numbers == null) throw new IllegalArgumentException("Array has to be initialized!");
        
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Numbers array cannot be empty");
        }
        
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        
        return max > -(min) ? max : min;
    }
}
