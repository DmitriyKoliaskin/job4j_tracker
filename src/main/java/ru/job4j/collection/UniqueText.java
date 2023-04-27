package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        return new HashSet<>(List.of(originText.split(" ")))
                .containsAll(new HashSet<>(List.of(duplicateText.split(" "))));
    }
}
