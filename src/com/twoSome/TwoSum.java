package com.twoSome;
import static org.junit.Assert.*;

import org.junit.Assert;

public class TwoSum {
    public static int[] twoSum(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {

            int first = input[i];

            for (int j = i + 1; j < input.length; j++) {
                int second = input[j];
                int total = first + second;

                if (total == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }

        }
        return null;
    }

    public static void main(String args[]) {

        // return pairs which adds to 29 in given array
        Assert.assertArrayEquals(new int[] { 1, 2 },
                twoSum(new int[] { 12, 17, 21, 25 }, 29));


//        Read more:

    }
}
