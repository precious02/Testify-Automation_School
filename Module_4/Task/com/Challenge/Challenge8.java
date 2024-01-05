// Given a collection of 1 million integers, all ranging between 1 to 9, sort them in Big O(n) time
package com.Challenge;

import java.util.Arrays;

public class Challenge8 {
    public static void main(String[] args) {

        int[] values = {8, 5, 3, 5, 7, 2, 1, 1, 8, 1, 2, 8, 6, 3, 5, 7, 7, 6};

        System.out.println("Main array is : " + Arrays.toString(values));

        countingSort(values, 1, 9);

        System.out.println("Sorted array is : " + Arrays.toString(values));
    }

    private static void countingSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];

        for (int num : arr) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            while (count[i - min] > 0) {
                arr[index++] = i;
                count[i - min]--;
            }
        }
    }
}



