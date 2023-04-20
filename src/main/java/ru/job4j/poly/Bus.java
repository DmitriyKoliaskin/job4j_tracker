package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе количество пассажиров: " + count);
    }

    @Override
    public double refill(double fuel) {
        return fuel * 50.34;
    }
}
