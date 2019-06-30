package main.java.methods;

import java.util.Arrays;
import java.util.Collections;

public class ArraysMethods {

    public static void sortByDesc(Integer[] array){
        System.out.println("Unsorted array is: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println();
    }

    public static void printSumPositive (int[] arr){
        int sum = 0;
        for (int i : arr){
            if (i > 0){
                sum =+ i;
            }
        }
        System.out.println("The sum of positives in array " + Arrays.toString(arr) + " is: " + sum);
        System.out.println();
    }

    public static void printAverageValue (int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        double average = sum / arr.length;
        System.out.println("Average of array: " + Arrays.toString(arr) + " is: " + average);
        System.out.println();
    }

}
