package main.java.classes;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListsMethods {

    public static void replaceValues(List<String> list, String param1, String param2) {
        System.out.println("List until replacement: " + list);
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(param1)) {
                iterator.set(param2);
            }
        }
        System.out.println("List after replacement: " + list);
        System.out.println();
    }

    public static void deleteDivisibleByThree(List<Integer> list) {
        System.out.println("List before deleting numbers divisible by 3 " + list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value % 3 == 0)
            {
                iterator.remove();
            }
        }
        System.out.println("List after deleting numbers divisible by 3 " + list);
        System.out.println();
    }

}
