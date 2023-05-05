package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftSplit = left.split(". ");
        String[] rightSplit = right.split(". ");
        int numberLeft = Integer.parseInt(leftSplit[0]);
        int numberRight = Integer.parseInt(rightSplit[0]);
        return Integer.compare(numberLeft, numberRight);
    }
}
