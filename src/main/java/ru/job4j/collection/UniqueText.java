package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> hashSet = new HashSet<>();

        for (var value : origin) {
            hashSet.add(value);
        }

        for (var value : text) {
            if (!hashSet.contains(value)) {
             rsl = false;
             break;
            }
        }
        return rsl;
    }
}
