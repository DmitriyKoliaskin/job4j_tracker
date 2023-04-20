package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] copyItems = new Item[size];
        int index = 0;
        for (var item : items) {
            if (item != null) {
                copyItems[index++] = item;
            }
        }
        return copyItems;
    }

    public Item[] findByName(String key) {
        Item[] copyItems = new Item[size];
        int index = 0;
        for (var item : items) {
            if (item != null && key.equals(item.getName())) {
                copyItems[index++] = item;
            }
        }
        return Arrays.copyOf(copyItems, index);
    }
}