package ru.job4j.oop;

public class College {

    /*
    Step-up type casting (upcasting) is used here.
     */
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object o = student;
    }
}
