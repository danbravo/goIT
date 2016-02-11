package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 5, -34};

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(intArray));

        for (Integer element : arrayList) {
            System.out.println(element);
        }

        System.out.println(arrayList.size());

//        Collections.swap(arrayList, 1, 5);
    }
}
