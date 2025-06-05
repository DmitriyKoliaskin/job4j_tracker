package ru.job4j.lambda;

public class Model {

    private String name;

    Model() {
    }

    Model(String s) {
        name = s;
        System.out.println(name);
    }

    String getName() {
        return name;
    }
}
