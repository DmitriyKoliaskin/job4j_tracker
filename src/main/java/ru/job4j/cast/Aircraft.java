package ru.job4j.cast;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет лети в небе.");
    }
}
