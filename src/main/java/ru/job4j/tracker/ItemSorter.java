package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {

    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
                new Item("Aeboy"),
                new Item("Petr"),
                new Item("Dima")
        );
        System.out.println(list);
        Collections.sort(list, new ItemAscByName());
        System.out.println(list);
        Collections.sort(list, new ItemDescByName());
        System.out.println(list);
    }
}
