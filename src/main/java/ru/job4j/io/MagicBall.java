package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = System.lineSeparator();
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String question = scanner.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println(question + ln + "Да");
        } else if (answer == 1) {
            System.out.println(question + ln + "Нет");
        } else {
            System.out.println(question + ln + "Может быть");
        }
    }
}