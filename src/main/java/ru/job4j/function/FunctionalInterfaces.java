package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = map::put;
        List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven");
        int i = 1;
        for (String string : list) {
            biConsumer.accept(i++, string);
        }

        BiPredicate<Integer, String> biPredicate = (key, value) -> (key % 2 == 0 || value.length() == 4);
        for (Integer key : map.keySet()) {
            if (biPredicate.test(key, map.get(key))) {
                System.out.println("key: " + key + " value: " + map.get(key));
            }
        }

        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        Consumer<String> consumer = System.out::println;
        Function<String, String> function = String::toUpperCase;

        for (String s : supplier.get()) {
            consumer.accept(function.apply(s));
        }
    }
}
