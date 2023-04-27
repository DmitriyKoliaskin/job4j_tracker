package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemSorterTest {

    @Test
    public void whenItemAscByName() {
        List<Item> list = Arrays.asList(
                new Item("Petr"),
                new Item("Aeboy"),
                new Item("Dima"),
                new Item("Stepan")
        );
        List<Item> expected = Arrays.asList(
                new Item("Aeboy"),
                new Item("Dima"),
                new Item("Petr"),
                new Item("Stepan")
        );
        Collections.sort(list, new ItemAscByName());
        assertThat(list).isEqualTo(expected);
    }

    @Test
    public void whenItemDescByName() {
        List<Item> list = Arrays.asList(
                new Item("Petr"),
                new Item("Aeboy"),
                new Item("Dima"),
                new Item("Stepan")
        );
        List<Item> expected = Arrays.asList(
                new Item("Stepan"),
                new Item("Petr"),
                new Item("Dima"),
                new Item("Aeboy")
        );
        Collections.sort(list, new ItemDescByName());
        assertThat(list).isEqualTo(expected);
    }
}