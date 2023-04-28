package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        map.put("hipf02@gmail.com", "Dmitriy Koliaskin Aleksandrovich");
        map.put("frety@yandex.ru", "Frosia Evko Petrovna");
        map.put("asgx@mail.ru", "Anton Krasco Ivanich");
        map.put("frety@yandex.ru", "Frosia Evko Petrovna");
        map.put("asgx@mail.ru", "Anton Krasco Ivanich");

        for (var key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
