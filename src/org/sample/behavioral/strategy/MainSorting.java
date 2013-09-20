package org.sample.behavioral.strategy;

public class MainSorting {
    public static void main(String[] args) {
        //membuat sorting context object
        ContextSorting contextSorting = new ContextSorting();
        //set strategy sorting
        ConcreteStrategyBubbleSort b = new ConcreteStrategyBubbleSort();
        contextSorting.setStrategy(b);
        //perform sorting
        contextSorting.performSorting();
    }
}
