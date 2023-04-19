package ru.job4j.oop;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog polkan = new Dog("Polkan");
        Dog sharik = new Dog("Sharik");
        Dog zhychka = new Dog("Zhychka");
    }
}
