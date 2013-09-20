package org.sample.behavioral.strategy;

public class ContextSorting {

    private StrategySortable strategy;
    private Integer[] unSorted;
    private Integer[] sorted;

    public void setStrategy(StrategySortable strategy) {
        this.strategy = strategy;
    }

    public void performSorting() {
        sorted = strategy.sort(unSorted);
    }
}
