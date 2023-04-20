package ru.job4j.cast;

public class Planet {

    public static void main(String[] args) {
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle aircraft1 = new Aircraft();
        Vehicle aircraft2 = new Aircraft();

        Vehicle[] vehicles = new Vehicle[]{train1, train2, bus1, bus2, aircraft1, aircraft2};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
