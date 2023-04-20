package ru.job4j.oop;

public class College {

    /*
    Здесь приминяется повышающее привидение типов (up casting).
     */
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object o = student;
    }
}
