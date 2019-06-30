package main.java;

import main.java.methods.ArrayListsMethods;
import main.java.methods.ArraysMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 7, 11};
        ArraysMethods.sortByDesc(arr);

        List<String> arrList = new ArrayList<>();
        arrList.add("One");
        arrList.add("Two");
        arrList.add("Tree");
        arrList.add("Four");

        ArrayListsMethods.replaceValues(arrList, "Tree", "Three");

        int [] array = {1, -2, 8, -7, 9 };
        ArraysMethods.printSumPositive(array);
        ArraysMethods.printAverageValue(array);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(15);
        list.add(20);
        ArrayListsMethods.deleteDivisibleByThree(list);

    }

}
