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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }
}