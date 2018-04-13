package edu.ldsbc.PizzaApp;

public interface Comparable {
    default int compareTo(Object x) {
        return 0;
    }
}
