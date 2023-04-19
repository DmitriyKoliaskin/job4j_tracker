package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Лиса Краса Патрикеевна");
        student.setGroup("Хищник");
        student.setReceipt(new Date());
        System.out.println(student.getFio() + " " + student.getGroup() + " " + student.getReceipt());
    }
}
