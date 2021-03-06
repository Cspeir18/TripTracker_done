package com.example.cspeir.triptracker;

import java.util.ArrayList;

/**
 * Created by cspeir on 12/1/2017.
 */

public class ArrayListSorter {
    public static void insertionSort(ArrayList list) {

        for (int j = 1; j < list.size(); j++) {
            Comparable temp = (Comparable)list.get(j);
            int possibleIndex = j;

            while (possibleIndex > 0 && temp.compareTo(list.get(possibleIndex - 1)) < 0) {
                list.set(possibleIndex, list.get(possibleIndex - 1));
                possibleIndex--;
            }
            list.set(possibleIndex, temp);

        }
    }
}
