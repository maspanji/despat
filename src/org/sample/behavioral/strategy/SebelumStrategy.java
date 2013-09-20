package org.sample.behavioral.strategy;

public class SebelumStrategy {

    public Integer[] bubbleSort(Integer[] toSort) {
        return null;
    }

    public Integer[] insertionSort(Integer[] toSort) {
        return null;
    }

    public Integer[] quickSort(Integer[] toSort) {
        return null;
    }

    public void performSortint(String sorting) {
        Integer i[] = {12, 2, 3};
        if (sorting.equals("bubble")) {
            bubbleSort(i);
        } else if (sorting.equals("insertion")) {
            insertionSort(i);
        }
    }
}
